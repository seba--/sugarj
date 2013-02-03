package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple$Cong_2_0 extends Strategy 
{ 
  public static $Tuple$Cong_2_0 instance = new $Tuple$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_15, Strategy e_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail78:
    { 
      IStrategoTerm i_104 = null;
      IStrategoTerm f_104 = null;
      IStrategoTerm h_104 = null;
      IStrategoTerm j_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      f_104 = term.getSubterm(0);
      h_104 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      i_104 = annos69;
      term = d_15.invoke(context, f_104);
      if(term == null)
        break Fail78;
      j_104 = term;
      term = e_15.invoke(context, h_104);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTupleCong_2, new IStrategoTerm[]{j_104, term}), checkListAnnos(termFactory, i_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}