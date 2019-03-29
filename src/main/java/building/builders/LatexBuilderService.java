package building.builders;

import building.target.LatexBuildTargetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.BuilderService;

import java.util.Collections;
import java.util.List;

public class LatexBuilderService extends BuilderService {
    @NotNull
    @Override
    public List<LatexBuildTargetType> getTargetTypes() {
        System.out.println("calling getTargetTypes");
        return Collections.singletonList(LatexBuildTargetType.instance);
    }

    @NotNull
    @Override
    public List<LatexBuilder> createBuilders() {
        System.out.println("calling createBuilders");
        return Collections.singletonList(new LatexBuilder());
    }
}
