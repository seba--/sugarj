package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Signature_1_0 extends Strategy 
{ 
  public static $Signature_1_0 instance = new $Signature_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Signature_1_0");
    Fail58:
    { 
      IStrategoTerm a_110 = null;
      IStrategoTerm z_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSignature_1 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      z_109 = term.getSubterm(0);
      IStrategoList annos34 = term.getAnnotations();
      a_110 = annos34;
      term = p_18.invoke(context, z_109);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSignature_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}