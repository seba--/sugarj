package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Dec$Head_3_0 extends Strategy 
{ 
  public static $Enum$Dec$Head_3_0 instance = new $Enum$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17, Strategy c_17, Strategy d_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumDecHead_3_0");
    Fail48:
    { 
      IStrategoTerm y_106 = null;
      IStrategoTerm u_106 = null;
      IStrategoTerm v_106 = null;
      IStrategoTerm x_106 = null;
      IStrategoTerm z_106 = null;
      IStrategoTerm a_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      u_106 = term.getSubterm(0);
      v_106 = term.getSubterm(1);
      x_106 = term.getSubterm(2);
      IStrategoList annos39 = term.getAnnotations();
      y_106 = annos39;
      term = b_17.invoke(context, u_106);
      if(term == null)
        break Fail48;
      z_106 = term;
      term = c_17.invoke(context, v_106);
      if(term == null)
        break Fail48;
      a_107 = term;
      term = d_17.invoke(context, x_106);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{z_106, a_107, term}), checkListAnnos(termFactory, y_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}