package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail114:
    { 
      IStrategoTerm b_110 = null;
      IStrategoTerm a_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      a_110 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      b_110 = annos102;
      term = e_17.invoke(context, a_110);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}