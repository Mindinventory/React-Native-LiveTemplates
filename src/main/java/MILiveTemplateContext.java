import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class MILiveTemplateContext extends TemplateContextType {
    protected MILiveTemplateContext() {
        super("MILiveTemplate", "MILiveTemplate");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".js");
    }
}