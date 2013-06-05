package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$No$Args_2_0 extends Strategy 
{ 
  public static $S$Def$No$Args_2_0 instance = new $S$Def$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_19, Strategy c_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail78:
    { 
      IStrategoTerm v_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm u_111 = null;
      IStrategoTerm w_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      t_111 = term.getSubterm(0);
      u_111 = term.getSubterm(1);
      IStrategoList annos51 = term.getAnnotations();
      v_111 = annos51;
      term = b_19.invoke(context, t_111);
      if(term == null)
        break Fail78;
      w_111 = term;
      term = c_19.invoke(context, u_111);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSDefNoArgs_2, new IStrategoTerm[]{w_111, term}), checkListAnnos(termFactory, v_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}