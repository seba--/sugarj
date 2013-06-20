package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Label$Dyn$Rule$Id_2_0 extends Strategy 
{ 
  public static $Add$Label$Dyn$Rule$Id_2_0 instance = new $Add$Label$Dyn$Rule$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_16, Strategy s_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail43:
    { 
      IStrategoTerm z_104 = null;
      IStrategoTerm x_104 = null;
      IStrategoTerm y_104 = null;
      IStrategoTerm a_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      x_104 = term.getSubterm(0);
      y_104 = term.getSubterm(1);
      IStrategoList annos16 = term.getAnnotations();
      z_104 = annos16;
      term = r_16.invoke(context, x_104);
      if(term == null)
        break Fail43;
      a_105 = term;
      term = s_16.invoke(context, y_104);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAddLabelDynRuleId_2, new IStrategoTerm[]{a_105, term}), checkListAnnos(termFactory, z_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}