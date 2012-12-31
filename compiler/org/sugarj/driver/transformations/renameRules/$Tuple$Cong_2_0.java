package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14, Strategy z_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail75:
    { 
      IStrategoTerm c_104 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm b_104 = null;
      IStrategoTerm d_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      z_103 = term.getSubterm(0);
      b_104 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      c_104 = annos69;
      term = y_14.invoke(context, z_103);
      if(term == null)
        break Fail75;
      d_104 = term;
      term = z_14.invoke(context, b_104);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTupleCong_2, new IStrategoTerm[]{d_104, term}), checkListAnnos(termFactory, c_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}