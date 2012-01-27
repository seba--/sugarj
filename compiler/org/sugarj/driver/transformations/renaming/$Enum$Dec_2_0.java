package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec_2_0 extends Strategy 
{ 
  public static $Enum$Dec_2_0 instance = new $Enum$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17, Strategy f_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDec_2_0");
    Fail49:
    { 
      IStrategoTerm e_107 = null;
      IStrategoTerm c_107 = null;
      IStrategoTerm d_107 = null;
      IStrategoTerm g_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      c_107 = term.getSubterm(0);
      d_107 = term.getSubterm(1);
      IStrategoList annos40 = term.getAnnotations();
      e_107 = annos40;
      term = e_17.invoke(context, c_107);
      if(term == null)
        break Fail49;
      g_107 = term;
      term = f_17.invoke(context, d_107);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDec_2, new IStrategoTerm[]{g_107, term}), checkListAnnos(termFactory, e_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}