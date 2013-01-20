package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Dec_2_0 extends Strategy 
{ 
  public static $Editor$Services$Dec_2_0 instance = new $Editor$Services$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_27, Strategy f_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDec_2_0");
    Fail35:
    { 
      IStrategoTerm a_126 = null;
      IStrategoTerm y_125 = null;
      IStrategoTerm z_125 = null;
      IStrategoTerm b_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEditorServicesDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      y_125 = term.getSubterm(0);
      z_125 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      a_126 = annos12;
      term = e_27.invoke(context, y_125);
      if(term == null)
        break Fail35;
      b_126 = term;
      term = f_27.invoke(context, z_125);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEditorServicesDec_2, new IStrategoTerm[]{b_126, term}), checkListAnnos(termFactory, a_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}