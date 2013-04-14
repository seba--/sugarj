package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_12, Strategy o_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail47:
    { 
      IStrategoTerm e_97 = null;
      IStrategoTerm c_97 = null;
      IStrategoTerm d_97 = null;
      IStrategoTerm g_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      c_97 = term.getSubterm(0);
      d_97 = term.getSubterm(1);
      IStrategoList annos38 = term.getAnnotations();
      e_97 = annos38;
      term = n_12.invoke(context, c_97);
      if(term == null)
        break Fail47;
      g_97 = term;
      term = o_12.invoke(context, d_97);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consModule_2, new IStrategoTerm[]{g_97, term}), checkListAnnos(termFactory, e_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}