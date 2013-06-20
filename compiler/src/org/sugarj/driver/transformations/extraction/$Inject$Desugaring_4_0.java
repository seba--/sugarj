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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_16, Strategy b_16, Strategy c_16, Strategy d_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InjectDesugaring_4_0");
    Fail33:
    { 
      IStrategoTerm g_103 = null;
      IStrategoTerm c_103 = null;
      IStrategoTerm d_103 = null;
      IStrategoTerm e_103 = null;
      IStrategoTerm f_103 = null;
      IStrategoTerm h_103 = null;
      IStrategoTerm i_103 = null;
      IStrategoTerm j_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consInjectDesugaring_4 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      c_103 = term.getSubterm(0);
      d_103 = term.getSubterm(1);
      e_103 = term.getSubterm(2);
      f_103 = term.getSubterm(3);
      IStrategoList annos6 = term.getAnnotations();
      g_103 = annos6;
      term = a_16.invoke(context, c_103);
      if(term == null)
        break Fail33;
      h_103 = term;
      term = b_16.invoke(context, d_103);
      if(term == null)
        break Fail33;
      i_103 = term;
      term = c_16.invoke(context, e_103);
      if(term == null)
        break Fail33;
      j_103 = term;
      term = d_16.invoke(context, f_103);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consInjectDesugaring_4, new IStrategoTerm[]{h_103, i_103, j_103, term}), checkListAnnos(termFactory, g_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}