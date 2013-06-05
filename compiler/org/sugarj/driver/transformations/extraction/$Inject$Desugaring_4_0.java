package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_15, Strategy a_16, Strategy b_16, Strategy c_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail33:
    { 
      IStrategoTerm e_103 = null;
      IStrategoTerm a_103 = null;
      IStrategoTerm b_103 = null;
      IStrategoTerm c_103 = null;
      IStrategoTerm d_103 = null;
      IStrategoTerm f_103 = null;
      IStrategoTerm g_103 = null;
      IStrategoTerm h_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      a_103 = term.getSubterm(0);
      b_103 = term.getSubterm(1);
      c_103 = term.getSubterm(2);
      d_103 = term.getSubterm(3);
      IStrategoList annos6 = term.getAnnotations();
      e_103 = annos6;
      term = z_15.invoke(context, a_103);
      if(term == null)
        break Fail33;
      f_103 = term;
      term = a_16.invoke(context, b_103);
      if(term == null)
        break Fail33;
      g_103 = term;
      term = b_16.invoke(context, c_103);
      if(term == null)
        break Fail33;
      h_103 = term;
      term = c_16.invoke(context, d_103);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consInjectDesugaring_4, new IStrategoTerm[]{f_103, g_103, h_103, term}), checkListAnnos(termFactory, e_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}