package building.builders;

import building.target.LatexBuildRootDescriptor;
import building.target.LatexBuildTarget;
import building.target.LatexBuildTargetType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.incremental.*;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;

import java.util.Collections;

public class LatexBuilder extends TargetBuilder<LatexBuildRootDescriptor, LatexBuildTarget> {
    public LatexBuilder() {
        super(Collections.singleton(LatexBuildTargetType.instance));
        System.out.println("Latex builder constructed");
    }

    @Override
    public void build(@NotNull LatexBuildTarget target,
                      @NotNull DirtyFilesHolder<LatexBuildRootDescriptor,
                              LatexBuildTarget> holder,
                      @NotNull BuildOutputConsumer outputConsumer,
                      @NotNull CompileContext context) {
        System.out.println("Calling building() LatexBuilder");
        CompilerMessage message = new CompilerMessage(
                "Latex compiler",
                BuildMessage.Kind.ERROR,
                "Test Error"
        );
        context.processMessage(message);
    }

    @NotNull
    @Override
    public String getPresentableName() {
        System.out.println("Getting builder presentable name");
        return "Latex builder";
    }
}
