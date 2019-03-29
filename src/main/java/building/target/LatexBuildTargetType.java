package building.target;

import org.apache.commons.lang.NotImplementedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildTargetLoader;
import org.jetbrains.jps.builders.BuildTargetType;
import org.jetbrains.jps.model.JpsModel;

import java.util.List;

public class LatexBuildTargetType extends BuildTargetType<LatexBuildTarget> {
    public static final LatexBuildTargetType instance = new LatexBuildTargetType(
            "Latex-building-type",
            true);

    private LatexBuildTargetType(String typeId, boolean fileBased) {
        super(typeId, fileBased);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    @Override
    public List computeAllTargets(@NotNull JpsModel model) {
        throw new NotImplementedException("compute all targets not implemented");
    }

    @NotNull
    @Override
    public BuildTargetLoader createLoader(@NotNull JpsModel model) {
        throw new NotImplementedException("Create loader not implemented");
    }
}
