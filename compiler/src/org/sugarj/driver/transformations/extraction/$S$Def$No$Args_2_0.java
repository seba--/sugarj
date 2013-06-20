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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_19, Strategy e_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefNoArgs_2_0");
    Fail79:
    { 
      IStrategoTerm a_112 = null;
      IStrategoTerm y_111 = null;
      IStrategoTerm z_111 = null;
      IStrategoTerm b_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      y_111 = term.getSubterm(0);
      z_111 = term.getSubterm(1);
      IStrategoList annos52 = term.getAnnotations();
      a_112 = annos52;
      term = d_19.invoke(context, y_111);
      if(term == null)
        break Fail79;
      b_112 = term;
      term = e_19.invoke(context, z_111);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSDefNoArgs_2, new IStrategoTerm[]{b_112, term}), checkListAnnos(termFactory, a_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}