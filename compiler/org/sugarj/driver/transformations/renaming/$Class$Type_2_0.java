package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Type_2_0 extends Strategy 
{ 
  public static $Class$Type_2_0 instance = new $Class$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_38, Strategy a_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassType_2_0");
    Fail194:
    { 
      IStrategoTerm i_169 = null;
      IStrategoTerm g_169 = null;
      IStrategoTerm h_169 = null;
      IStrategoTerm j_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      g_169 = term.getSubterm(0);
      h_169 = term.getSubterm(1);
      IStrategoList annos163 = term.getAnnotations();
      i_169 = annos163;
      term = z_38.invoke(context, g_169);
      if(term == null)
        break Fail194;
      j_169 = term;
      term = a_39.invoke(context, h_169);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassType_2, new IStrategoTerm[]{j_169, term}), checkListAnnos(termFactory, i_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}