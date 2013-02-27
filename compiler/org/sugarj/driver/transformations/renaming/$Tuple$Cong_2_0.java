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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_14, Strategy y_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail79:
    { 
      IStrategoTerm b_104 = null;
      IStrategoTerm x_103 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm c_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      x_103 = term.getSubterm(0);
      z_103 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      b_104 = annos69;
      term = x_14.invoke(context, x_103);
      if(term == null)
        break Fail79;
      c_104 = term;
      term = y_14.invoke(context, z_103);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTupleCong_2, new IStrategoTerm[]{c_104, term}), checkListAnnos(termFactory, b_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}