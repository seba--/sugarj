package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Field_2_0 extends Strategy 
{ 
  public static $Field_2_0 instance = new $Field_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_29, Strategy h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Field_2_0");
    Fail67:
    { 
      IStrategoTerm f_133 = null;
      IStrategoTerm z_132 = null;
      IStrategoTerm c_133 = null;
      IStrategoTerm j_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consField_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      z_132 = term.getSubterm(0);
      c_133 = term.getSubterm(1);
      IStrategoList annos43 = term.getAnnotations();
      f_133 = annos43;
      term = g_29.invoke(context, z_132);
      if(term == null)
        break Fail67;
      j_133 = term;
      term = h_29.invoke(context, c_133);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consField_2, new IStrategoTerm[]{j_133, term}), checkListAnnos(termFactory, f_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}