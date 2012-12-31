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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_29, Strategy z_29, Strategy a_30, Strategy b_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDecHead_4_0");
    Fail77:
    { 
      IStrategoTerm g_137 = null;
      IStrategoTerm b_137 = null;
      IStrategoTerm c_137 = null;
      IStrategoTerm d_137 = null;
      IStrategoTerm f_137 = null;
      IStrategoTerm h_137 = null;
      IStrategoTerm i_137 = null;
      IStrategoTerm j_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInterfaceDecHead_4 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      b_137 = term.getSubterm(0);
      c_137 = term.getSubterm(1);
      d_137 = term.getSubterm(2);
      f_137 = term.getSubterm(3);
      IStrategoList annos53 = term.getAnnotations();
      g_137 = annos53;
      term = y_29.invoke(context, b_137);
      if(term == null)
        break Fail77;
      h_137 = term;
      term = z_29.invoke(context, c_137);
      if(term == null)
        break Fail77;
      i_137 = term;
      term = a_30.invoke(context, d_137);
      if(term == null)
        break Fail77;
      j_137 = term;
      term = b_30.invoke(context, f_137);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInterfaceDecHead_4, new IStrategoTerm[]{h_137, i_137, j_137, term}), checkListAnnos(termFactory, g_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}