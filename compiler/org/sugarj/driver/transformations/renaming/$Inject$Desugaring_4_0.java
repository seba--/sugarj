package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Inject$Desugaring_4_0 extends Strategy 
{ 
  public static $Inject$Desugaring_4_0 instance = new $Inject$Desugaring_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18, Strategy c_18, Strategy d_18, Strategy e_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail26:
    { 
      IStrategoTerm f_106 = null;
      IStrategoTerm b_106 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm e_106 = null;
      IStrategoTerm g_106 = null;
      IStrategoTerm h_106 = null;
      IStrategoTerm i_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      b_106 = term.getSubterm(0);
      c_106 = term.getSubterm(1);
      d_106 = term.getSubterm(2);
      e_106 = term.getSubterm(3);
      IStrategoList annos8 = term.getAnnotations();
      f_106 = annos8;
      term = b_18.invoke(context, b_106);
      if(term == null)
        break Fail26;
      g_106 = term;
      term = c_18.invoke(context, c_106);
      if(term == null)
        break Fail26;
      h_106 = term;
      term = d_18.invoke(context, d_106);
      if(term == null)
        break Fail26;
      i_106 = term;
      term = e_18.invoke(context, e_106);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInjectDesugaring_4, new IStrategoTerm[]{g_106, h_106, i_106, term}), checkListAnnos(termFactory, f_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}