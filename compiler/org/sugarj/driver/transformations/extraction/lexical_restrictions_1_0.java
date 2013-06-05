package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_restrictions_1_0 extends Strategy 
{ 
  public static lexical_restrictions_1_0 instance = new lexical_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_restrictions_1_0");
    Fail254:
    { 
      IStrategoTerm p_145 = null;
      IStrategoTerm i_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conslexical_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      i_145 = term.getSubterm(0);
      IStrategoList annos206 = term.getAnnotations();
      p_145 = annos206;
      term = t_28.invoke(context, i_145);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conslexical_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}