package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Transformation$Def_2_0 extends Strategy 
{ 
  public static $Transformation$Def_2_0 instance = new $Transformation$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_333, Strategy s_333)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransformationDef_2_0");
    Fail730:
    { 
      IStrategoTerm y_423 = null;
      IStrategoTerm w_423 = null;
      IStrategoTerm x_423 = null;
      IStrategoTerm z_423 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTransformationDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail730;
      w_423 = term.getSubterm(0);
      x_423 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      y_423 = annos2;
      term = r_333.invoke(context, w_423);
      if(term == null)
        break Fail730;
      z_423 = term;
      term = s_333.invoke(context, x_423);
      if(term == null)
        break Fail730;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTransformationDef_2, new IStrategoTerm[]{z_423, term}), checkListAnnos(termFactory, y_423));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}