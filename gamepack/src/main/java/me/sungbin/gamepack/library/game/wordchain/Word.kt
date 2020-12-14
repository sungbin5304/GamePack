package me.sungbin.gamepack.library.game.wordchain

import android.content.Context
import me.sungbin.gamepack.library.util.Util.readAssets


object Word {

    internal lateinit var context: Context
    private lateinit var _WORDS: String
    private val wordsCache = HashMap<String, List<String>>()
    private val usedWords = ArrayList<String>()

    val WORDS: String
        get() {
            if (!::_WORDS.isInitialized) {
                _WORDS = readAssets(context, "words.txt")
            }
            return _WORDS
        }

    private val duumList = arrayOf(
        arrayOf("라", "나"),
        arrayOf("락", "낙"),
        arrayOf("띾", "낚"),
        arrayOf("띿", "낛"),
        arrayOf("란", "난"),
        arrayOf("랁", "낝"),
        arrayOf("랂", "낞"),
        arrayOf("랃", "낟"),
        arrayOf("랄", "날"),
        arrayOf("랅", "낡"),
        arrayOf("랆", "낢"),
        arrayOf("랇", "낣"),
        arrayOf("랈", "낤"),
        arrayOf("랉", "낥"),
        arrayOf("랊", "낦"),
        arrayOf("랋", "낧"),
        arrayOf("람", "남"),
        arrayOf("랍", "납"),
        arrayOf("랎", "낪"),
        arrayOf("랏", "낫"),
        arrayOf("랐", "났"),
        arrayOf("랑", "낭"),
        arrayOf("랒", "낮"),
        arrayOf("랓", "낯"),
        arrayOf("랔", "낰"),
        arrayOf("랕", "낱"),
        arrayOf("랖", "낲"),
        arrayOf("랗", "낳"),
        arrayOf("래", "내"),
        arrayOf("랙", "낵"),
        arrayOf("랚", "낶"),
        arrayOf("랛", "낷"),
        arrayOf("랜", "낸"),
        arrayOf("랝", "낹"),
        arrayOf("랞", "낺"),
        arrayOf("랟", "낻"),
        arrayOf("랠", "낼"),
        arrayOf("랡", "낽"),
        arrayOf("랢", "낾"),
        arrayOf("랣", "낿"),
        arrayOf("랤", "냀"),
        arrayOf("랥", "냁"),
        arrayOf("랦", "냂"),
        arrayOf("랧", "냃"),
        arrayOf("램", "냄"),
        arrayOf("랩", "냅"),
        arrayOf("랪", "냆"),
        arrayOf("랫", "냇"),
        arrayOf("랬", "냈"),
        arrayOf("랭", "냉"),
        arrayOf("랮", "냊"),
        arrayOf("랯", "냋"),
        arrayOf("랰", "냌"),
        arrayOf("랱", "냍"),
        arrayOf("랲", "냎"),
        arrayOf("랳", "냏"),
        arrayOf("로", "노"),
        arrayOf("록", "녹"),
        arrayOf("롞", "녺"),
        arrayOf("롟", "녻"),
        arrayOf("론", "논"),
        arrayOf("롡", "녽"),
        arrayOf("롢", "녾"),
        arrayOf("롣", "녿"),
        arrayOf("롤", "놀"),
        arrayOf("롥", "놁"),
        arrayOf("롦", "놂"),
        arrayOf("롧", "놃"),
        arrayOf("롨", "놄"),
        arrayOf("롩", "놅"),
        arrayOf("롪", "놆"),
        arrayOf("롫", "놇"),
        arrayOf("롬", "놈"),
        arrayOf("롭", "놉"),
        arrayOf("롮", "놊"),
        arrayOf("롯", "놋"),
        arrayOf("롰", "놌"),
        arrayOf("롱", "농"),
        arrayOf("롲", "놎"),
        arrayOf("롳", "놏"),
        arrayOf("롴", "놐"),
        arrayOf("롵", "놑"),
        arrayOf("롶", "높"),
        arrayOf("롷", "놓"),
        arrayOf("뢰", "뇌"),
        arrayOf("뢱", "뇍"),
        arrayOf("뢲", "뇎"),
        arrayOf("뢳", "뇏"),
        arrayOf("뢴", "뇐"),
        arrayOf("뢵", "뇑"),
        arrayOf("뢶", "뇒"),
        arrayOf("뢷", "뇓"),
        arrayOf("뢸", "뇔"),
        arrayOf("뢹", "뇕"),
        arrayOf("뢺", "뇖"),
        arrayOf("뢻", "뇗"),
        arrayOf("뢼", "뇘"),
        arrayOf("뢽", "뇙"),
        arrayOf("뢾", "뇚"),
        arrayOf("뢿", "뇛"),
        arrayOf("룀", "뇜"),
        arrayOf("룁", "뇝"),
        arrayOf("룂", "뇞"),
        arrayOf("룃", "뇟"),
        arrayOf("룄", "뇠"),
        arrayOf("룅", "뇡"),
        arrayOf("룆", "뇢"),
        arrayOf("룇", "뇣"),
        arrayOf("룈", "뇤"),
        arrayOf("룉", "뇥"),
        arrayOf("룊", "뇦"),
        arrayOf("룋", "뇧"),
        arrayOf("루", "누"),
        arrayOf("룩", "눅"),
        arrayOf("룪", "눆"),
        arrayOf("룫", "눇"),
        arrayOf("룬", "눈"),
        arrayOf("룭", "눉"),
        arrayOf("룮", "눊"),
        arrayOf("룯", "눋"),
        arrayOf("룰", "눌"),
        arrayOf("룱", "눍"),
        arrayOf("룲", "눎"),
        arrayOf("룳", "눏"),
        arrayOf("룴", "눐"),
        arrayOf("룵", "눑"),
        arrayOf("룶", "눒"),
        arrayOf("룷", "눓"),
        arrayOf("룸", "눔"),
        arrayOf("룹", "눕"),
        arrayOf("룺", "눖"),
        arrayOf("룻", "눗"),
        arrayOf("룼", "눘"),
        arrayOf("룽", "눙"),
        arrayOf("룾", "눚"),
        arrayOf("룿", "눛"),
        arrayOf("뤀", "눜"),
        arrayOf("뤁", "눝"),
        arrayOf("뤂", "눞"),
        arrayOf("뤃", "눟"),
        arrayOf("르", "느"),
        arrayOf("륵", "늑"),
        arrayOf("륶", "늒"),
        arrayOf("륷", "늓"),
        arrayOf("른", "는"),
        arrayOf("륹", "늕"),
        arrayOf("륺", "늖"),
        arrayOf("륻", "늗"),
        arrayOf("를", "늘"),
        arrayOf("륽", "늙"),
        arrayOf("륾", "늚"),
        arrayOf("륿", "늛"),
        arrayOf("릀", "늜"),
        arrayOf("릁", "늝"),
        arrayOf("릂", "늞"),
        arrayOf("릃", "늟"),
        arrayOf("름", "늠"),
        arrayOf("릅", "늡"),
        arrayOf("릆", "늢"),
        arrayOf("릇", "늣"),
        arrayOf("릈", "늤"),
        arrayOf("릉", "능"),
        arrayOf("릊", "늦"),
        arrayOf("릋", "늧"),
        arrayOf("릌", "늨"),
        arrayOf("릍", "늩"),
        arrayOf("릎", "늪"),
        arrayOf("릏", "늫"),
        arrayOf("랴", "야"),
        arrayOf("략", "약"),
        arrayOf("랶", "앾"),
        arrayOf("랷", "앿"),
        arrayOf("랸", "얀"),
        arrayOf("랹", "얁"),
        arrayOf("랺", "얂"),
        arrayOf("랻", "얃"),
        arrayOf("랼", "얄"),
        arrayOf("랽", "얅"),
        arrayOf("랾", "얆"),
        arrayOf("랿", "얇"),
        arrayOf("럀", "얈"),
        arrayOf("럁", "얉"),
        arrayOf("럂", "얊"),
        arrayOf("럃", "얋"),
        arrayOf("럄", "얌"),
        arrayOf("럅", "얍"),
        arrayOf("럆", "얎"),
        arrayOf("럇", "얏"),
        arrayOf("럈", "얐"),
        arrayOf("량", "양"),
        arrayOf("럊", "얒"),
        arrayOf("럋", "얓"),
        arrayOf("럌", "얔"),
        arrayOf("럍", "얕"),
        arrayOf("럎", "얖"),
        arrayOf("럏", "얗"),
        arrayOf("려", "여"),
        arrayOf("력", "역"),
        arrayOf("렦", "엮"),
        arrayOf("렧", "엯"),
        arrayOf("련", "연"),
        arrayOf("렩", "엱"),
        arrayOf("렪", "엲"),
        arrayOf("렫", "엳"),
        arrayOf("렬", "열"),
        arrayOf("렭", "엵"),
        arrayOf("렮", "엶"),
        arrayOf("렯", "엷"),
        arrayOf("렰", "엸"),
        arrayOf("렱", "엹"),
        arrayOf("렲", "엺"),
        arrayOf("렳", "엻"),
        arrayOf("렴", "염"),
        arrayOf("렵", "엽"),
        arrayOf("렶", "엾"),
        arrayOf("렷", "엿"),
        arrayOf("렸", "였"),
        arrayOf("령", "영"),
        arrayOf("렺", "옂"),
        arrayOf("렻", "옃"),
        arrayOf("렼", "옄"),
        arrayOf("렽", "옅"),
        arrayOf("렾", "옆"),
        arrayOf("렿", "옇"),
        arrayOf("례", "예"),
        arrayOf("롁", "옉"),
        arrayOf("롂", "옊"),
        arrayOf("롃", "옋"),
        arrayOf("롄", "옌"),
        arrayOf("롅", "옍"),
        arrayOf("롆", "옎"),
        arrayOf("롇", "옏"),
        arrayOf("롈", "옐"),
        arrayOf("롉", "옑"),
        arrayOf("롊", "옒"),
        arrayOf("롋", "옓"),
        arrayOf("롌", "옔"),
        arrayOf("롍", "옕"),
        arrayOf("롎", "옖"),
        arrayOf("롏", "옗"),
        arrayOf("롐", "옘"),
        arrayOf("롑", "옙"),
        arrayOf("롒", "옚"),
        arrayOf("롓", "옛"),
        arrayOf("롔", "옜"),
        arrayOf("롕", "옝"),
        arrayOf("롖", "옞"),
        arrayOf("롗", "옟"),
        arrayOf("롘", "옠"),
        arrayOf("롙", "옡"),
        arrayOf("롚", "옢"),
        arrayOf("롛", "옣"),
        arrayOf("료", "요"),
        arrayOf("룍", "욕"),
        arrayOf("룎", "욖"),
        arrayOf("룏", "욗"),
        arrayOf("룐", "욘"),
        arrayOf("룑", "욙"),
        arrayOf("룒", "욚"),
        arrayOf("룓", "욛"),
        arrayOf("룔", "욜"),
        arrayOf("룕", "욝"),
        arrayOf("룖", "욞"),
        arrayOf("룗", "욟"),
        arrayOf("룘", "욠"),
        arrayOf("룙", "욡"),
        arrayOf("룚", "욢"),
        arrayOf("룛", "욣"),
        arrayOf("룜", "욤"),
        arrayOf("룝", "욥"),
        arrayOf("룞", "욦"),
        arrayOf("룟", "욧"),
        arrayOf("룠", "욨"),
        arrayOf("룡", "용"),
        arrayOf("룢", "욪"),
        arrayOf("룣", "욫"),
        arrayOf("룤", "욬"),
        arrayOf("룥", "욭"),
        arrayOf("룦", "욮"),
        arrayOf("룧", "욯"),
        arrayOf("류", "유"),
        arrayOf("륙", "육"),
        arrayOf("륚", "윢"),
        arrayOf("륛", "윣"),
        arrayOf("륜", "윤"),
        arrayOf("륝", "윥"),
        arrayOf("륞", "윦"),
        arrayOf("륟", "윧"),
        arrayOf("률", "율"),
        arrayOf("륡", "윩"),
        arrayOf("륢", "윪"),
        arrayOf("륣", "윫"),
        arrayOf("륤", "윬"),
        arrayOf("륥", "윭"),
        arrayOf("륦", "윮"),
        arrayOf("륧", "윯"),
        arrayOf("륨", "윰"),
        arrayOf("륩", "윱"),
        arrayOf("륪", "윲"),
        arrayOf("륫", "윳"),
        arrayOf("륬", "윴"),
        arrayOf("륭", "융"),
        arrayOf("륮", "윶"),
        arrayOf("륯", "윷"),
        arrayOf("륰", "윸"),
        arrayOf("륱", "윹"),
        arrayOf("륲", "윺"),
        arrayOf("륳", "윻"),
        arrayOf("리", "이"),
        arrayOf("릭", "익"),
        arrayOf("릮", "읶"),
        arrayOf("릯", "읷"),
        arrayOf("린", "인"),
        arrayOf("릱", "읹"),
        arrayOf("릲", "읺"),
        arrayOf("릳", "읻"),
        arrayOf("릴", "일"),
        arrayOf("릵", "읽"),
        arrayOf("릶", "읾"),
        arrayOf("릷", "읿"),
        arrayOf("릸", "잀"),
        arrayOf("릹", "잁"),
        arrayOf("릺", "잂"),
        arrayOf("릻", "잃"),
        arrayOf("림", "임"),
        arrayOf("립", "입"),
        arrayOf("릾", "잆"),
        arrayOf("릿", "잇"),
        arrayOf("맀", "있"),
        arrayOf("링", "잉"),
        arrayOf("맂", "잊"),
        arrayOf("맃", "잋"),
        arrayOf("맄", "잌"),
        arrayOf("맅", "잍"),
        arrayOf("맆", "잎"),
        arrayOf("맇", "잏"),
        arrayOf("녀", "여"),
        arrayOf("녁", "역"),
        arrayOf("녂", "엮"),
        arrayOf("녃", "엯"),
        arrayOf("년", "연"),
        arrayOf("녅", "엱"),
        arrayOf("녆", "엲"),
        arrayOf("녇", "엳"),
        arrayOf("녈", "열"),
        arrayOf("녉", "엵"),
        arrayOf("녊", "엶"),
        arrayOf("녋", "엷"),
        arrayOf("녌", "엸"),
        arrayOf("녍", "엹"),
        arrayOf("녎", "엺"),
        arrayOf("녏", "엻"),
        arrayOf("념", "염"),
        arrayOf("녑", "엽"),
        arrayOf("녒", "엾"),
        arrayOf("녓", "엿"),
        arrayOf("녔", "였"),
        arrayOf("녕", "영"),
        arrayOf("녖", "옂"),
        arrayOf("녗", "옃"),
        arrayOf("녘", "옄"),
        arrayOf("녙", "옅"),
        arrayOf("녚", "옆"),
        arrayOf("녛", "옇"),
        arrayOf("뇨", "요"),
        arrayOf("뇩", "욕"),
        arrayOf("뇪", "욖"),
        arrayOf("뇫", "욗"),
        arrayOf("뇬", "욘"),
        arrayOf("뇭", "욙"),
        arrayOf("뇮", "욚"),
        arrayOf("뇯", "욛"),
        arrayOf("뇰", "욜"),
        arrayOf("뇱", "욝"),
        arrayOf("뇲", "욞"),
        arrayOf("뇳", "욟"),
        arrayOf("뇴", "욠"),
        arrayOf("뇵", "욡"),
        arrayOf("뇶", "욢"),
        arrayOf("뇷", "욣"),
        arrayOf("뇸", "욤"),
        arrayOf("뇹", "욥"),
        arrayOf("뇺", "욦"),
        arrayOf("뇻", "욧"),
        arrayOf("뇼", "욨"),
        arrayOf("뇽", "용"),
        arrayOf("뇾", "욪"),
        arrayOf("뇿", "욫"),
        arrayOf("눀", "욬"),
        arrayOf("눁", "욭"),
        arrayOf("눂", "욮"),
        arrayOf("눃", "욯"),
        arrayOf("뉴", "유"),
        arrayOf("뉵", "육"),
        arrayOf("뉶", "윢"),
        arrayOf("뉷", "윣"),
        arrayOf("뉸", "윤"),
        arrayOf("뉹", "윥"),
        arrayOf("뉺", "윦"),
        arrayOf("뉻", "윧"),
        arrayOf("뉼", "율"),
        arrayOf("뉽", "윩"),
        arrayOf("뉾", "윪"),
        arrayOf("뉿", "윫"),
        arrayOf("늀", "윬"),
        arrayOf("늁", "윭"),
        arrayOf("늂", "윮"),
        arrayOf("늃", "윯"),
        arrayOf("늄", "윰"),
        arrayOf("늅", "윱"),
        arrayOf("늆", "윲"),
        arrayOf("늇", "윳"),
        arrayOf("늈", "윴"),
        arrayOf("늉", "융"),
        arrayOf("늊", "윶"),
        arrayOf("늋", "윷"),
        arrayOf("늌", "윸"),
        arrayOf("늍", "윹"),
        arrayOf("늎", "윺"),
        arrayOf("늏", "윻"),
        arrayOf("니", "이"),
        arrayOf("닉", "익"),
        arrayOf("닊", "읶"),
        arrayOf("닋", "읷"),
        arrayOf("닌", "인"),
        arrayOf("닍", "읹"),
        arrayOf("닎", "읺"),
        arrayOf("닏", "읻"),
        arrayOf("닐", "일"),
        arrayOf("닑", "읽"),
        arrayOf("닒", "읾"),
        arrayOf("닓", "읿"),
        arrayOf("닔", "잀"),
        arrayOf("닕", "잁"),
        arrayOf("닖", "잂"),
        arrayOf("닗", "잃"),
        arrayOf("님", "임"),
        arrayOf("닙", "입"),
        arrayOf("닚", "잆"),
        arrayOf("닛", "잇"),
        arrayOf("닜", "있"),
        arrayOf("닝", "잉"),
        arrayOf("닞", "잊"),
        arrayOf("닟", "잋"),
        arrayOf("닠", "잌"),
        arrayOf("닡", "잍"),
        arrayOf("닢", "잎"),
        arrayOf("닣", "잏")
    )

    fun checkDuum(fullWord: String): String? {
        val lastWord = fullWord.last().toString()
        duumList.map {
            if (it.first() == lastWord) return it.last()
        }
        return null
    }

    fun loadUseableWord(fullWord: String): String? {
        val lastWord = fullWord.last().toString()
        if (wordsCache.contains(lastWord)) { // 마지막 글자로 단어 조회 한 번 이상 됬을 때
            wordsCache[lastWord]!!.map {
                if (!usedWords.contains(it)) {
                    useWord(it)
                    return it
                }
            }
            return null
        } else { // 마지막 글자로 단어 조회가 한 번도 안됬을 때 -> 단어 조회만 하고 재귀호출
            val words = ArrayList<String>()
            words.addAll(WORDS.split("\n"))
            words.filter { it.startsWith(lastWord) }
            wordsCache[lastWord] = words
            return loadUseableWord(fullWord)
        }
    }

    fun clearUseWord() {
        usedWords.clear()
    }

    fun isUseableWord(fullWord: String) = !usedWords.contains(fullWord) && WORDS.contains(fullWord)

    fun useWord(fullWord: String) = usedWords.add(fullWord)

    fun checkIsUsed(fullWord: String) = usedWords.contains(fullWord)

}