package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Q_2_0 instance = new $Ext$Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_346, Strategy e_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail954:
    { 
      IStrategoTerm b_456 = null;
      IStrategoTerm z_455 = null;
      IStrategoTerm a_456 = null;
      IStrategoTerm c_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail954;
      z_455 = term.getSubterm(0);
      a_456 = term.getSubterm(1);
      IStrategoList annos197 = term.getAnnotations();
      b_456 = annos197;
      term = d_346.invoke(context, z_455);
      if(term == null)
        break Fail954;
      c_456 = term;
      term = e_346.invoke(context, a_456);
      if(term == null)
        break Fail954;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExtOpDeclQ_2, new IStrategoTerm[]{c_456, term}), checkListAnnos(termFactory, b_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}