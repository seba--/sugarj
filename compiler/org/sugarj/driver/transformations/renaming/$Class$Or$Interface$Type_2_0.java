package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Or$Interface$Type_2_0 extends Strategy 
{ 
  public static $Class$Or$Interface$Type_2_0 instance = new $Class$Or$Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_24, Strategy u_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassOrInterfaceType_2_0");
    Fail154:
    { 
      IStrategoTerm h_128 = null;
      IStrategoTerm f_128 = null;
      IStrategoTerm g_128 = null;
      IStrategoTerm i_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassOrInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      f_128 = term.getSubterm(0);
      g_128 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      h_128 = annos138;
      term = t_24.invoke(context, f_128);
      if(term == null)
        break Fail154;
      i_128 = term;
      term = u_24.invoke(context, g_128);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassOrInterfaceType_2, new IStrategoTerm[]{i_128, term}), checkListAnnos(termFactory, h_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}