package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_17, Strategy b_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail112:
    { 
      IStrategoTerm a_110 = null;
      IStrategoTerm y_109 = null;
      IStrategoTerm z_109 = null;
      IStrategoTerm b_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      y_109 = term.getSubterm(0);
      z_109 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      a_110 = annos103;
      term = a_17.invoke(context, y_109);
      if(term == null)
        break Fail112;
      b_110 = term;
      term = b_17.invoke(context, z_109);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclQ_2, new IStrategoTerm[]{b_110, term}), checkListAnnos(termFactory, a_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}