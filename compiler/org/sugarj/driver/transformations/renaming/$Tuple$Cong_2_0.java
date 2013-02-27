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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_15, Strategy b_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail79:
    { 
      IStrategoTerm e_104 = null;
      IStrategoTerm c_104 = null;
      IStrategoTerm d_104 = null;
      IStrategoTerm f_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      c_104 = term.getSubterm(0);
      d_104 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      e_104 = annos69;
      term = a_15.invoke(context, c_104);
      if(term == null)
        break Fail79;
      f_104 = term;
      term = b_15.invoke(context, d_104);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTupleCong_2, new IStrategoTerm[]{f_104, term}), checkListAnnos(termFactory, e_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}