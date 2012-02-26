package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec$Head_4_0 extends Strategy 
{ 
  public static $Interface$Dec$Head_4_0 instance = new $Interface$Dec$Head_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16, Strategy g_16, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDecHead_4_0");
    Fail39:
    { 
      IStrategoTerm d_104 = null;
      IStrategoTerm x_103 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm b_104 = null;
      IStrategoTerm c_104 = null;
      IStrategoTerm e_104 = null;
      IStrategoTerm f_104 = null;
      IStrategoTerm h_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInterfaceDecHead_4 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      x_103 = term.getSubterm(0);
      z_103 = term.getSubterm(1);
      b_104 = term.getSubterm(2);
      c_104 = term.getSubterm(3);
      IStrategoList annos27 = term.getAnnotations();
      d_104 = annos27;
      term = f_16.invoke(context, x_103);
      if(term == null)
        break Fail39;
      e_104 = term;
      term = g_16.invoke(context, z_103);
      if(term == null)
        break Fail39;
      f_104 = term;
      term = h_16.invoke(context, b_104);
      if(term == null)
        break Fail39;
      h_104 = term;
      term = i_16.invoke(context, c_104);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{e_104, f_104, h_104, term}), checkListAnnos(termFactory, d_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}