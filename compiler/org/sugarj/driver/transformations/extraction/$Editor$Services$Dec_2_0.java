package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_30, Strategy z_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDec_2_0");
    Fail285:
    { 
      IStrategoTerm z_153 = null;
      IStrategoTerm x_153 = null;
      IStrategoTerm y_153 = null;
      IStrategoTerm a_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consEditorServicesDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail285;
      x_153 = term.getSubterm(0);
      y_153 = term.getSubterm(1);
      IStrategoList annos239 = term.getAnnotations();
      z_153 = annos239;
      term = y_30.invoke(context, x_153);
      if(term == null)
        break Fail285;
      a_154 = term;
      term = z_30.invoke(context, y_153);
      if(term == null)
        break Fail285;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consEditorServicesDec_2, new IStrategoTerm[]{a_154, term}), checkListAnnos(termFactory, z_153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}