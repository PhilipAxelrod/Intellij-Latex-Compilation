package building.scope;

import building.target.LatexBuildTargetType;
import com.intellij.compiler.impl.BuildTargetScopeProvider;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.api.CmdlineProtoUtil;
import com.intellij.openapi.module.Module;
import static org.jetbrains.jps.api.CmdlineRemoteProto.Message.ControllerMessage.ParametersMessage.TargetTypeBuildScope;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LatexBuildScopeProvider extends BuildTargetScopeProvider {
    @NotNull
    @Override
    public List<TargetTypeBuildScope> getBuildTargetScopes(@NotNull CompileScope baseScope,
                                                           @NotNull Project project,
                                                           boolean forceBuild) {
        System.out.println("getBuildTargetScopes was called");

        Stream<Module> modules = Arrays.stream(baseScope.getAffectedModules());
        List<String> moduleIds = modules.map(Module::getName).collect(Collectors.toList());

        TargetTypeBuildScope scope = CmdlineProtoUtil.createTargetsScope(
                LatexBuildTargetType.instance.getTypeId(),
                moduleIds,
                true);
        return Collections.singletonList(scope);
    }
}
