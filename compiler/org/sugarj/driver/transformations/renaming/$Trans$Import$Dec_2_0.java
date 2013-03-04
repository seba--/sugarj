package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$Import$Dec_2_0 extends Strategy 
{ 
  public static $Trans$Import$Dec_2_0 instance = new $Trans$Import$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_27, Strategy a_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransImportDec_2_0");
    Fail47:
    { 
      IStrategoTerm f_128 = null;
      IStrategoTerm d_128 = null;
      IStrategoTerm e_128 = null;
      IStrategoTerm g_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTransImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      d_128 = term.getSubterm(0);
      e_128 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      f_128 = annos24;
      term = z_27.invoke(context, d_128);
      if(term == null)
        break Fail47;
      g_128 = term;
      term = a_28.invoke(context, e_128);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTransImportDec_2, new IStrategoTerm[]{g_128, term}), checkListAnnos(termFactory, f_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}