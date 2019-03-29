package building.target;

import org.jetbrains.jps.builders.BuildRootDescriptor;

import java.io.File;

public class LatexBuildRootDescriptor extends BuildRootDescriptor {
    private File myRoot;
    private String myRootId;
    private LatexBuildTarget myTarget;

    public LatexBuildRootDescriptor(File root,
                                    String rootId,
                                    LatexBuildTarget target) {
        myRoot = root;
        myRootId = rootId;
        myTarget = target;
    }

    @Override
    public String getRootId() {
        return myRootId;
    }

    @Override
    public File getRootFile() {
        return myRoot;
    }

    @Override
    public LatexBuildTarget getTarget() {
        return myTarget;
    }
}
