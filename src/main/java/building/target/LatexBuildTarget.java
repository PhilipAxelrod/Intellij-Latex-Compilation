package building.target;

import org.apache.commons.lang.NotImplementedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.*;
import org.jetbrains.jps.builders.storage.BuildDataPaths;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.indices.IgnoredFileIndex;
import org.jetbrains.jps.indices.ModuleExcludeIndex;
import org.jetbrains.jps.model.JpsModel;

import java.io.File;
import java.util.Collection;
import java.util.List;

public class LatexBuildTarget extends BuildTarget<LatexBuildRootDescriptor> {
    public LatexBuildTarget(BuildTargetType targetType) {
        super(targetType);
    }

    @Override
    public String getId() {
        return "Latex-building-target";
    }

    @Override
    public Collection<BuildTarget<?>> computeDependencies(BuildTargetRegistry targetRegistry, TargetOutputIndex outputIndex) {
        throw new NotImplementedException("computeDependencies");
    }

    @NotNull
    @Override
    public List<LatexBuildRootDescriptor> computeRootDescriptors(JpsModel model,
                                                                 ModuleExcludeIndex index,
                                                                 IgnoredFileIndex ignoredFileIndex,
                                                                 BuildDataPaths dataPaths) {
        throw new NotImplementedException("computeRootDescriptors");
    }

    @Nullable
    @Override
    public LatexBuildRootDescriptor findRootDescriptor(String rootId, BuildRootIndex rootIndex) {
        throw new NotImplementedException("findRootDescriptor(");
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Latex building target presentable";
    }

    @NotNull
    @Override
    public Collection<File> getOutputRoots(CompileContext context) {
        throw new NotImplementedException("getOutputRoots");
    }
}
