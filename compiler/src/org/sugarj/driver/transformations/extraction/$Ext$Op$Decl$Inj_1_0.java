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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail141:
    { 
      IStrategoTerm x_123 = null;
      IStrategoTerm w_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      w_123 = term.getSubterm(0);
      IStrategoList annos111 = term.getAnnotations();
      x_123 = annos111;
      term = l_23.invoke(context, w_123);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}