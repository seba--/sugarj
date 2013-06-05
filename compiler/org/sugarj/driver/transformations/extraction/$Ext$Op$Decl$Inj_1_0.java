package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Inj_1_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Inj_1_0 instance = new $Ext$Op$Decl$Inj_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail140:
    { 
      IStrategoTerm s_123 = null;
      IStrategoTerm r_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      r_123 = term.getSubterm(0);
      IStrategoList annos110 = term.getAnnotations();
      s_123 = annos110;
      term = j_23.invoke(context, r_123);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}