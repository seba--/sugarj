package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_17, Strategy d_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail116:
    { 
      IStrategoTerm c_110 = null;
      IStrategoTerm a_110 = null;
      IStrategoTerm b_110 = null;
      IStrategoTerm d_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      a_110 = term.getSubterm(0);
      b_110 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      c_110 = annos103;
      term = c_17.invoke(context, a_110);
      if(term == null)
        break Fail116;
      d_110 = term;
      term = d_17.invoke(context, b_110);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclQ_2, new IStrategoTerm[]{d_110, term}), checkListAnnos(termFactory, c_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}