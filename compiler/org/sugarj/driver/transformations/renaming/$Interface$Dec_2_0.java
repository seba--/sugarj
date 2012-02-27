package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec_2_0 extends Strategy 
{ 
  public static $Interface$Dec_2_0 instance = new $Interface$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_16, Strategy s_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDec_2_0");
    Fail42:
    { 
      IStrategoTerm t_104 = null;
      IStrategoTerm r_104 = null;
      IStrategoTerm s_104 = null;
      IStrategoTerm u_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      r_104 = term.getSubterm(0);
      s_104 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      t_104 = annos28;
      term = r_16.invoke(context, r_104);
      if(term == null)
        break Fail42;
      u_104 = term;
      term = s_16.invoke(context, s_104);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDec_2, new IStrategoTerm[]{u_104, term}), checkListAnnos(termFactory, t_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}