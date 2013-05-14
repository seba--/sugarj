package org.sugarj.common.typesmart;

import java.util.Arrays;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

/**
 * Adds caching caching to {@link TypesmartTermFactory} tailored to typesmart syntax.
 * 
 * @author Sebastian Erdweg
 */
public class TypesmartSyntaxTermFactory extends TypesmartTermFactory {

  private class Key {
    private final String ctr;
    private final IStrategoTerm[] argsorts;
    
    public Key(IStrategoTerm ctr, IStrategoTerm[] args) {
      this.ctr = ctr.toString();
      this.argsorts = new IStrategoTerm[args.length];
      for (int i = 0; i < args.length; i++)
        this.argsorts[i] = getSort(args[i]);
    }

    private IStrategoTerm getSort(IStrategoTerm term) {
      IStrategoTerm sort;
      
      if ((sort = TypesmartSortAttachment.getSort(term)) != null)
        return sort;
      
      switch (term.getTermType()) {
      case IStrategoTerm.STRING:
        return baseFactory.makeString("");
      case IStrategoTerm.LIST:
        return baseFactory.makeList(getSortList(term.getAllSubterms()));
      case IStrategoTerm.TUPLE:
        return baseFactory.makeTuple(getSortList(term.getAllSubterms()));
      case IStrategoTerm.BLOB:
        return baseFactory.makeString(term.getClass().getCanonicalName());
      default:
        System.err.println("no sort: " + term.toString());
        return null;
      }
    }
    
    private IStrategoTerm[] getSortList(IStrategoTerm[] terms) {
      for (int i = 0; i < terms.length; i++)
        terms[i] = getSort(terms[i]);
      return terms;
    }

    @Override
    public int hashCode() {
      return 31 * ctr.hashCode() + Arrays.hashCode(argsorts);
    }
    
    @Override
    public boolean equals(Object o) {
      return o instanceof Key 
          && ((Key) o).ctr.equals(ctr)
          && Arrays.equals(((Key) o).argsorts, argsorts);
    }
  }
  
  private final static Ehcache cache;
  static {
    CacheManager.getInstance().addCache("typesmart-syntax");
    cache = CacheManager.getInstance().getEhcache("typesmart-syntax");
  }
  
  /*
   * cache statistics are per instance
   */
  public int cacheHits = 0;
  public int cacheMisses = 0;
  
  public static TypesmartSyntaxTermFactory registerNewTypeSmartTermFactory(IContext context) {
    TypesmartSyntaxTermFactory factory = new TypesmartSyntaxTermFactory(context.getFactory(), context);
    context.setFactory(factory);
    return factory;
  }
  
  public TypesmartSyntaxTermFactory(ITermFactory baseFactory, IContext context) {
    super(baseFactory, context);
  }

  @Override
  public IStrategoAppl makeAppl(IStrategoConstructor ctr, IStrategoTerm[] terms, IStrategoList annotations) {
    rebuildEmptyLists(terms);
    Key key = new Key(ctr, terms);
    Element el = cache.get(key);
    if (el != null) {
      cacheHits++;
      IStrategoAppl appl = baseFactory.makeAppl(ctr, terms, annotations);
      TypesmartSortAttachment.put(appl, (IStrategoTerm) el.getObjectValue());
      return appl;
    }
    
    cacheMisses++;
    IStrategoAppl appl = super.makeAppl(ctr, terms, annotations);
    IStrategoTerm sort = TypesmartSortAttachment.getSort(appl);
    cache.put(new Element(key, sort));
    
    return appl;
  }
}
