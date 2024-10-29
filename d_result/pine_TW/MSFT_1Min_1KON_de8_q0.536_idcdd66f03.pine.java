//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MSFT_1Min_1KON_cdd66f03 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1KON_cdd66f03", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_cdd66f03(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( source <= 390.846 )
		if( xrsi <= 29.7622 )
			if( nvimax <= 0.033385 )
				if( nvim <= 0.004904 )
					if( pvi <= -0.057274 )
						ret := 1.000000 // buy
					if( pvi > -0.057274 )
						ret := 0.833333 // buy
				if( nvim > 0.004904 )
					ret := 0.111111
			if( nvimax > 0.033385 )
				ret := 1.000000 // buy
		if( xrsi > 29.7622 )
			if( verde_azul <= 83.827 )
				if( media <= 83.8135 )
					if( stoc <= 22.5794 )
						if( pvim <= -0.152815 )
							if( nvimin <= 0.106008 )
								ret := 1.000000 // buy
							if( nvimin > 0.106008 )
								ret := 0.666667
						if( pvim > -0.152815 )
							if( media <= 22.0606 )
								ret := 0.666667
							if( media > 22.0606 )
								if( pvi_ema <= -0.095817 )
									ret := -0.810811 // sell
								if( pvi_ema > -0.095817 )
									ret := 0.183673
					if( stoc > 22.5794 )
						if( pvimin <= -0.091622 )
							if( xmf <= 52.6455 )
								if( BollOsc <= 1.98143 )
									ret := 0.821782 // buy
								if( BollOsc > 1.98143 )
									ret := 0.375000
							if( xmf > 52.6455 )
								ret := 1.000000 // buy
						if( pvimin > -0.091622 )
							if( nvimax <= 0.034058 )
								if( pvim <= -0.089907 )
									ret := 0.952381 // buy
								if( pvim > -0.089907 )
									ret := 0.476190
							if( nvimax > 0.034058 )
								if( marron <= 52.9106 )
									ret := -0.045455
								if( marron > 52.9106 )
									ret := -0.692308
				if( media > 83.8135 )
					ret := -0.413793
			if( verde_azul > 83.827 )
				if( media <= 78.3754 )
					if( pvi <= -0.112037 )
						ret := -1.000000 // sell
					if( pvi > -0.112037 )
						if( marron_mean <= 71.592 )
							ret := -0.272727
						if( marron_mean > 71.592 )
							ret := 0.153846
				if( media > 78.3754 )
					if( marron_mean <= 101.22 )
						if( source <= 390.143 )
							ret := 0.916667 // buy
						if( source > 390.143 )
							ret := 0.400000
					if( marron_mean > 101.22 )
						ret := 0.230769
	if( source > 390.846 )
		if( xrsi <= 48.4392 )
			if( verde_media <= -61.917 )
				if( media_azul <= 21.3989 )
					if( pvi_ema <= -0.035272 )
						if( tprice <= 428.98 )
							if( verde_media <= -104.515 )
								if( verde_media <= -206.448 )
									ret := 1.000000 // buy
								if( verde_media > -206.448 )
									ret := 0.622047
							if( verde_media > -104.515 )
								if( verde_mean <= -52.3355 )
									ret := 0.530612
								if( verde_mean > -52.3355 )
									ret := 0.124498
						if( tprice > 428.98 )
							if( media_azul <= 17.5239 )
								if( pvimax <= -0.036915 )
									ret := 0.792000 // buy
								if( pvimax > -0.036915 )
									ret := 0.200000
							if( media_azul > 17.5239 )
								if( marron_mean <= -11.5612 )
									ret := -0.923077 // sell
								if( marron_mean > -11.5612 )
									ret := 0.769231 // buy
					if( pvi_ema > -0.035272 )
						if( marron <= 27.3688 )
							if( media_azul <= 13.0085 )
								if( azul_mean <= 58.6304 )
									ret := -0.402685
								if( azul_mean > 58.6304 )
									ret := 0.588235
							if( media_azul > 13.0085 )
								if( pvi_ema <= 0.000844 )
									ret := 0.587302
								if( pvi_ema > 0.000844 )
									ret := -0.352941
						if( marron > 27.3688 )
							if( xmf <= 41.6691 )
								if( azul <= 45.5091 )
									ret := 0.833333 // buy
								if( azul > 45.5091 )
									ret := 1.000000 // buy
							if( xmf > 41.6691 )
								ret := 0.200000
				if( media_azul > 21.3989 )
					if( marron_mean <= -9.29105 )
						if( nvi <= 0.120474 )
							if( nvimin <= 0.108376 )
								if( azul_mean <= -36.3689 )
									ret := -0.620690
								if( azul_mean > -36.3689 )
									ret := 0.428571
							if( nvimin > 0.108376 )
								if( oscp <= -60.9292 )
									ret := 0.500000
								if( oscp > -60.9292 )
									ret := 1.000000 // buy
						if( nvi > 0.120474 )
							if( stoc <= 8.81234 )
								if( nvim <= 0.136361 )
									ret := -0.818182 // sell
								if( nvim > 0.136361 )
									ret := 0.444444
							if( stoc > 8.81234 )
								if( BollOsc <= -71.0561 )
									ret := -0.615385
								if( BollOsc > -71.0561 )
									ret := -0.963636 // sell
					if( marron_mean > -9.29105 )
						if( verde <= -86.4643 )
							if( nvimin <= 0.189395 )
								if( verde_mean <= 12.8409 )
									ret := 0.486607
								if( verde_mean > 12.8409 )
									ret := 0.980000 // buy
							if( nvimin > 0.189395 )
								if( verde <= -104.389 )
									ret := -0.549020
								if( verde > -104.389 )
									ret := 0.909091 // buy
						if( verde > -86.4643 )
							if( media_azul <= 60.8482 )
								if( media <= 54.2125 )
									ret := 0.121870
								if( media > 54.2125 )
									ret := -0.198364
							if( media_azul > 60.8482 )
								if( marron_mean <= 74.6248 )
									ret := 0.285613
								if( marron_mean > 74.6248 )
									ret := -0.237410
			if( verde_media > -61.917 )
				if( verde_mean <= -13.543 )
					if( nvimin <= -0.007113 )
						if( nvi_ema <= -0.007362 )
							if( marron <= 26.1421 )
								if( nvim <= -0.010781 )
									ret := -0.583333
								if( nvim > -0.010781 )
									ret := 0.034483
							if( marron > 26.1421 )
								ret := -0.764706 // sell
						if( nvi_ema > -0.007362 )
							if( azul_mean <= -8.61498 )
								ret := -1.000000 // sell
							if( azul_mean > -8.61498 )
								if( verde <= -9.78927 )
									ret := 0.062500
								if( verde > -9.78927 )
									ret := -0.920000 // sell
					if( nvimin > -0.007113 )
						if( stoc <= 5.31064 )
							if( source <= 449.064 )
								if( source <= 407.52 )
									ret := 0.628205
								if( source > 407.52 )
									ret := 0.052632
							if( source > 449.064 )
								if( pvi_ema <= 0.003649 )
									ret := 1.000000 // buy
								if( pvi_ema > 0.003649 )
									ret := 0.900000 // buy
						if( stoc > 5.31064 )
							if( tprice <= 395.804 )
								if( pvim <= -0.090376 )
									ret := 0.117647
								if( pvim > -0.090376 )
									ret := -0.692308
							if( tprice > 395.804 )
								if( pvimin <= -0.001226 )
									ret := -0.033690
								if( pvimin > -0.001226 )
									ret := -0.248555
				if( verde_mean > -13.543 )
					if( pvimin <= -0.02336 )
						if( pvimin <= -0.107717 )
							if( nvimin <= 0.086029 )
								if( tprice <= 392.566 )
									ret := -0.285714
								if( tprice > 392.566 )
									ret := 0.633803
							if( nvimin > 0.086029 )
								if( oscp <= -48.4367 )
									ret := 0.888889 // buy
								if( oscp > -48.4367 )
									ret := 0.039470
						if( pvimin > -0.107717 )
							if( azul_mean <= 14.807 )
								if( pvi_ema <= -0.020497 )
									ret := 0.018813
								if( pvi_ema > -0.020497 )
									ret := -0.603659
							if( azul_mean > 14.807 )
								if( oscp <= -24.1812 )
									ret := -0.008658
								if( oscp > -24.1812 )
									ret := -0.312687
					if( pvimin > -0.02336 )
						if( tprice <= 453.193 )
							if( nvi_ema <= 0.019364 )
								if( source <= 400.217 )
									ret := 0.415094
								if( source > 400.217 )
									ret := -0.034454
							if( nvi_ema > 0.019364 )
								if( pvim <= 0.007507 )
									ret := 0.305200
								if( pvim > 0.007507 )
									ret := 0.131858
						if( tprice > 453.193 )
							if( tprice <= 466.139 )
								if( media_azul <= 85.1201 )
									ret := -0.127900
								if( media_azul > 85.1201 )
									ret := 0.338798
							if( tprice > 466.139 )
								if( media_azul <= 11.4737 )
									ret := 1.000000 // buy
								if( media_azul > 11.4737 )
									ret := 0.193333
		if( xrsi > 48.4392 )
			if( media_azul <= 107.541 )
				if( source <= 428.841 )
					if( oscp <= 15.4511 )
						if( media <= 39.4528 )
							if( xmf <= 4.17979 )
								if( stoc <= 45.2908 )
									ret := 0.906250 // buy
								if( stoc > 45.2908 )
									ret := -0.333333
							if( xmf > 4.17979 )
								if( xrsi <= 69.246 )
									ret := -0.249622
								if( xrsi > 69.246 )
									ret := 1.000000 // buy
						if( media > 39.4528 )
							if( source <= 406.879 )
								if( BollOsc <= 58.3167 )
									ret := 0.091310
								if( BollOsc > 58.3167 )
									ret := -0.590164
							if( source > 406.879 )
								if( verde_media <= 20.7228 )
									ret := -0.032898
								if( verde_media > 20.7228 )
									ret := 0.059461
					if( oscp > 15.4511 )
						if( xrsi <= 74.4604 )
							if( tprice <= 406.221 )
								if( nvimax <= 0.063437 )
									ret := -0.101370
								if( nvimax > 0.063437 )
									ret := -0.433018
							if( tprice > 406.221 )
								if( media <= 36.1787 )
									ret := -0.444444
								if( media > 36.1787 )
									ret := -0.107174
						if( xrsi > 74.4604 )
							if( BollOsc <= 63.7222 )
								if( nvi <= 0.175594 )
									ret := -0.141784
								if( nvi > 0.175594 )
									ret := 0.361607
							if( BollOsc > 63.7222 )
								if( marron_mean <= 93.0146 )
									ret := -0.389610
								if( marron_mean > 93.0146 )
									ret := 0.356627
				if( source > 428.841 )
					if( oscp <= -1.67994 )
						if( marron_mean <= 110.497 )
							if( stoc <= 17.8906 )
								if( nvi_ema <= 0.111554 )
									ret := -0.433333
								if( nvi_ema > 0.111554 )
									ret := -0.968750 // sell
							if( stoc > 17.8906 )
								if( verde_mean <= 49.6083 )
									ret := -0.242965
								if( verde_mean > 49.6083 )
									ret := -0.088104
						if( marron_mean > 110.497 )
							if( azul <= 39.8173 )
								if( media <= 114.587 )
									ret := -0.941176 // sell
								if( media > 114.587 )
									ret := -0.600000
							if( azul > 39.8173 )
								ret := -0.400000
					if( oscp > -1.67994 )
						if( tprice <= 442.286 )
							if( marron_mean <= 101.681 )
								if( xmf <= 55.8813 )
									ret := 0.008516
								if( xmf > 55.8813 )
									ret := -0.115322
							if( marron_mean > 101.681 )
								if( verde_mean <= 143.775 )
									ret := -0.332663
								if( verde_mean > 143.775 )
									ret := 0.198795
						if( tprice > 442.286 )
							if( tprice <= 466.472 )
								if( xrsi <= 74.0728 )
									ret := -0.018263
								if( xrsi > 74.0728 )
									ret := 0.191139
							if( tprice > 466.472 )
								if( nvi_ema <= 0.118988 )
									ret := -0.709302 // sell
								if( nvi_ema > 0.118988 )
									ret := -0.068376
			if( media_azul > 107.541 )
				if( media <= 114.975 )
					if( nvim <= 0.180761 )
						if( pvimax <= -0.139184 )
							if( pvimax <= -0.145295 )
								if( verde_mean <= 117.946 )
									ret := -0.132353
								if( verde_mean > 117.946 )
									ret := 0.390244
							if( pvimax > -0.145295 )
								if( nvim <= 0.176495 )
									ret := 0.505155
								if( nvim > 0.176495 )
									ret := 1.000000 // buy
						if( pvimax > -0.139184 )
							if( nvimin <= 0.161888 )
								if( pvi <= -0.062868 )
									ret := 0.258163
								if( pvi > -0.062868 )
									ret := 0.047059
							if( nvimin > 0.161888 )
								if( pvi <= -0.117054 )
									ret := -0.070312
								if( pvi > -0.117054 )
									ret := -0.583333
					if( nvim > 0.180761 )
						if( marron_mean <= 91.7131 )
							if( oscp <= 7.49543 )
								if( verde_azul <= 98.1386 )
									ret := -0.650000
								if( verde_azul > 98.1386 )
									ret := 0.266667
							if( oscp > 7.49543 )
								if( pvimax <= -0.151833 )
									ret := 0.633803
								if( pvimax > -0.151833 )
									ret := 0.101449
						if( marron_mean > 91.7131 )
							if( xmf <= 62.66 )
								if( verde_azul <= 148.775 )
									ret := -0.320000
								if( verde_azul > 148.775 )
									ret := 0.725000 // buy
							if( xmf > 62.66 )
								if( media <= 114.037 )
									ret := -0.389381
								if( media > 114.037 )
									ret := 0.785714 // buy
				if( media > 114.975 )
					if( stoc <= 90.9321 )
						if( pvim <= -0.135314 )
							ret := -0.125000
						if( pvim > -0.135314 )
							if( xmf <= 86.0078 )
								if( pvi_ema <= 0.0077 )
									ret := -0.876712 // sell
								if( pvi_ema > 0.0077 )
									ret := -0.611111
							if( xmf > 86.0078 )
								if( BollOsc <= 45.6793 )
									ret := -0.250000
								if( BollOsc > 45.6793 )
									ret := 0.000000
					if( stoc > 90.9321 )
						if( tprice <= 424.337 )
							if( marron <= 120.254 )
								ret := 0.428571
							if( marron > 120.254 )
								if( azul_mean <= 6.30479 )
									ret := -0.666667
								if( azul_mean > 6.30479 )
									ret := -1.000000 // sell
						if( tprice > 424.337 )
							if( pvimax <= -0.02725 )
								if( tprice <= 429.362 )
									ret := 0.833333 // buy
								if( tprice > 429.362 )
									ret := 0.181818
							if( pvimax > -0.02725 )
								if( verde_mean <= 148.709 )
									ret := -0.642857
								if( verde_mean > 148.709 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Blai5_Koncorde_v10 
//@version=5
//indicator title="Koncorde v10", shorttitle="Konk_v5", overlay=false)

// Declare variables with explicit types
var float pvi = na
var float nvi = na

tprice = ohlc4
lengthEMA = input.int(255, minval=1)
m = input.int(15)
source = hlc3

// Pececillos
pvi := volume > volume[1] ? nz(pvi[1]) + (close - close[1]) / close[1] : nz(pvi[1])
pvim = ta.ema(pvi, m)
pvimax = ta.highest(pvim, 90)
pvimin = ta.lowest(pvim, 90)
oscp = (pvi - pvim) * 100 / (pvimax - pvimin)

// Tiburones
nvi := volume < volume[1] ? nz(nvi[1]) + (close - close[1]) / close[1] : nz(nvi[1])
nvim = ta.ema(nvi, m)
nvimax = ta.highest(nvim, 90)
nvimin = ta.lowest(nvim, 90)
azul = (nvi - nvim) * 100 / (nvimax - nvimin)

// // Money Flow Index
// Money Flow Index
source_positive = ta.change(source) > 0 ? source : 0
source_negative = ta.change(source) < 0 ? source : 0
upper_s = math.sum(volume * source_positive, 14)
lower_s = math.sum(volume * source_negative, 14)
// Custom Money Flow Index calculation
money_flow_ratio = upper_s / lower_s
xmf = 100 - (100 / (1 + money_flow_ratio))


// Bollinger
mult = input.float(2.0)
basis = ta.sma(tprice, 25)
dev = mult * ta.stdev(tprice, 25)
upper = basis + dev
lower = basis - dev
OB1 = (upper + lower) / 2.0
OB2 = upper - lower
BollOsc = (tprice - OB1) / OB2 * 100

xrsi = ta.rsi(tprice, 14)

// Stochastic Calculation Function
calc_stoch(src, length, smoothFastD) =>
    ll = ta.lowest(low, length)
    hh = ta.highest(high, length)
    k = 100 * (src - ll) / (hh - ll)
    ta.sma(k, smoothFastD)

stoc = calc_stoch(tprice, 21, 3)
marron = (xrsi + xmf + BollOsc + stoc / 3) / 2
verde = marron + oscp
media = ta.ema(marron, m)
bandacero = 0.0

azul_mean = ta.sma(azul, 5)
verde_mean = ta.sma(verde, 5)
marron_mean = ta.sma(marron, 5)
verde_azul = verde - azul
verde_media = verde - media
media_azul = media - azul
media_marron = media - marron
pvi_ema = pvim
nvi_ema = nvi

// PLOT
vl = plot(verde, color=color.new(#66FF66, 0), style=plot.style_area, title="verde")  // GREEN
ml = plot(marron, color=color.new(#FFCC99, 0), style=plot.style_area, title="marron")  // BEIGE
al = plot(azul, color=color.new(#00FFFF, 0), style=plot.style_area, title="azul")  // CYAN
plot(marron, color=color.new(#330000, 0), style=plot.style_line, linewidth=2, title="lmarron")  // DARK RED
plot(verde, color=color.new(#006600, 0), style=plot.style_line, linewidth=2, title="lineav")  // DARK GREEN
plot(azul, color=color.new(#000066, 0), style=plot.style_line, title="lazul")  // DARK BLUE
plot(media, color=color.new(#FF0000, 0), title="media", style=plot.style_line, linewidth=2)  // RED
plot(bandacero, color=color.new(#000000, 0), title="cero")  // BLACK

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MSFT_1Min_cdd66f03(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


