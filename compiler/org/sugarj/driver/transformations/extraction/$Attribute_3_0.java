package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Attribute_3_0 extends Strategy 
{ 
  public static $Attribute_3_0 instance = new $Attribute_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_336, Strategy y_336, Strategy z_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Attribute_3_0");
    Fail789:
    { 
      IStrategoTerm k_432 = null;
      IStrategoTerm h_432 = null;
      IStrategoTerm i_432 = null;
      IStrategoTerm j_432 = null;
      IStrategoTerm l_432 = null;
      IStrategoTerm m_432 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAttribute_3 != ((IStrategoAppl)term).getConstructor())
        break Fail789;
      h_432 = term.getSubterm(0);
      i_432 = term.getSubterm(1);
      j_432 = term.getSubterm(2);
      IStrategoList annos53 = term.getAnnotations();
      k_432 = annos53;
      term = x_336.invoke(context, h_432);
      if(term == null)
        break Fail789;
      l_432 = term;
      term = y_336.invoke(context, i_432);
      if(term == null)
        break Fail789;
      m_432 = term;
      term = z_336.invoke(context, j_432);
      if(term == null)
        break Fail789;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAttribute_3, new IStrategoTerm[]{l_432, m_432, term}), checkListAnnos(termFactory, k_432));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}