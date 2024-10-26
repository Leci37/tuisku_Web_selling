//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AMD_5Min_1KON_18c26c0d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1KON_18c26c0d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_18c26c0d(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -22.0269 )
		if( pvimin <= 1.08956 )
			if( media <= 9.40044 )
				if( pvi_ema <= 0.459416 )
					if( tprice <= 96.2449 )
						if( nvim <= -0.150041 )
							ret := 0.846154 // buy
						if( nvim > -0.150041 )
							ret := 1.000000 // buy
					if( tprice > 96.2449 )
						if( pvimax <= 0.455844 )
							if( azul_mean <= 20.4819 )
								if( xmf <= 26.2291 )
									ret := -0.312796
								if( xmf > 26.2291 )
									ret := 0.645161
							if( azul_mean > 20.4819 )
								if( pvi <= 0.41197 )
									ret := 1.000000 // buy
								if( pvi > 0.41197 )
									ret := 0.466667
						if( pvimax > 0.455844 )
							if( pvimin <= 0.433161 )
								if( media <= 4.58244 )
									ret := -1.000000 // sell
								if( media > 4.58244 )
									ret := -0.928571 // sell
							if( pvimin > 0.433161 )
								if( marron_mean <= -3.1755 )
									ret := 0.214286
								if( marron_mean > -3.1755 )
									ret := -0.864865 // sell
				if( pvi_ema > 0.459416 )
					if( xrsi <= 4.47624 )
						if( tprice <= 169.373 )
							ret := -0.700000 // sell
						if( tprice > 169.373 )
							ret := -0.950000 // sell
					if( xrsi > 4.47624 )
						if( verde_mean <= -18.6802 )
							if( verde_azul <= -33.3149 )
								if( nvi <= -0.327078 )
									ret := -0.764706 // sell
								if( nvi > -0.327078 )
									ret := 0.175542
							if( verde_azul > -33.3149 )
								if( BollOsc <= -68.4971 )
									ret := -0.178571
								if( BollOsc > -68.4971 )
									ret := 0.518868
						if( verde_mean > -18.6802 )
							if( tprice <= 140.811 )
								ret := -1.000000 // sell
							if( tprice > 140.811 )
								ret := 0.111111
			if( media > 9.40044 )
				if( verde_mean <= 36.9801 )
					if( azul_mean <= 80.3941 )
						if( azul <= -94.2045 )
							if( pvi <= 0.633416 )
								if( media_azul <= 166.152 )
									ret := -0.963636 // sell
								if( media_azul > 166.152 )
									ret := -0.666667
							if( pvi > 0.633416 )
								if( media <= 44.395 )
									ret := -0.250000
								if( media > 44.395 )
									ret := -1.000000 // sell
						if( azul > -94.2045 )
							if( marron <= -9.35479 )
								if( pvimin <= 0.438132 )
									ret := 0.015464
								if( pvimin > 0.438132 )
									ret := -0.316908
							if( marron > -9.35479 )
								if( xrsi <= 41.4359 )
									ret := -0.040958
								if( xrsi > 41.4359 )
									ret := -0.248547
					if( azul_mean > 80.3941 )
						if( marron <= 36.4626 )
							if( verde_mean <= -102.906 )
								if( pvim <= 0.898389 )
									ret := -0.416667
								if( pvim > 0.898389 )
									ret := -1.000000 // sell
							if( verde_mean > -102.906 )
								if( pvimax <= 0.777378 )
									ret := 0.807018 // buy
								if( pvimax > 0.777378 )
									ret := -0.490566
						if( marron > 36.4626 )
							if( stoc <= 81.7828 )
								if( marron_mean <= 32.2802 )
									ret := -0.953846 // sell
								if( marron_mean > 32.2802 )
									ret := -0.703390 // sell
							if( stoc > 81.7828 )
								ret := -0.142857
				if( verde_mean > 36.9801 )
					if( xmf <= 36.1783 )
						if( verde <= -32.6978 )
							if( stoc <= 48.4767 )
								if( azul <= -21.9005 )
									ret := -0.960784 // sell
								if( azul > -21.9005 )
									ret := -0.243243
							if( stoc > 48.4767 )
								if( verde <= -37.205 )
									ret := 0.555556
								if( verde > -37.205 )
									ret := -0.916667 // sell
						if( verde > -32.6978 )
							if( nvimax <= -0.113778 )
								if( BollOsc <= -17.7835 )
									ret := 0.329897
								if( BollOsc > -17.7835 )
									ret := 0.603053
							if( nvimax > -0.113778 )
								if( pvimax <= 0.861205 )
									ret := -0.256757
								if( pvimax > 0.861205 )
									ret := 0.515152
					if( xmf > 36.1783 )
						if( nvi <= -0.176684 )
							if( verde_mean <= 82.6131 )
								if( pvimax <= 0.403792 )
									ret := 0.333333
								if( pvimax > 0.403792 )
									ret := -0.509025
							if( verde_mean > 82.6131 )
								if( nvi <= -0.19492 )
									ret := 0.549020
								if( nvi > -0.19492 )
									ret := -0.580645
						if( nvi > -0.176684 )
							if( media <= 99.7617 )
								if( marron <= 72.2456 )
									ret := 0.219224
								if( marron > 72.2456 )
									ret := -0.234375
							if( media > 99.7617 )
								if( media_azul <= 83.4446 )
									ret := -0.884615 // sell
								if( media_azul > 83.4446 )
									ret := -0.230769
		if( pvimin > 1.08956 )
			if( media <= 69.8244 )
				if( verde <= -20.4948 )
					ret := 0.578947
				if( verde > -20.4948 )
					if( marron_mean <= 38.0651 )
						if( media_azul <= 43.1906 )
							ret := 1.000000 // buy
						if( media_azul > 43.1906 )
							ret := 0.833333 // buy
					if( marron_mean > 38.0651 )
						ret := 0.777778 // buy
			if( media > 69.8244 )
				if( azul_mean <= 37.3436 )
					ret := -0.125000
				if( azul_mean > 37.3436 )
					ret := 0.800000 // buy
	if( oscp > -22.0269 )
		if( verde_mean <= 211.86 )
			if( stoc <= 48.9097 )
				if( oscp <= 4.39025 )
					if( pvimin <= 0.469537 )
						if( media <= -2.27722 )
							if( media_azul <= 11.0129 )
								if( pvim <= 0.43764 )
									ret := 0.938462 // buy
								if( pvim > 0.43764 )
									ret := 0.090909
							if( media_azul > 11.0129 )
								ret := -0.363636
						if( media > -2.27722 )
							if( pvimax <= 0.465413 )
								if( marron <= 26.7047 )
									ret := 0.079710
								if( marron > 26.7047 )
									ret := -0.089445
							if( pvimax > 0.465413 )
								if( source <= 98.9788 )
									ret := -0.646018
								if( source > 98.9788 )
									ret := -0.144670
					if( pvimin > 0.469537 )
						if( tprice <= 160.688 )
							if( azul_mean <= 63.2227 )
								if( media <= 44.563 )
									ret := 0.131078
								if( media > 44.563 )
									ret := -0.019398
							if( azul_mean > 63.2227 )
								if( media <= 28.4932 )
									ret := 1.000000 // buy
								if( media > 28.4932 )
									ret := 0.777778 // buy
						if( tprice > 160.688 )
							if( azul_mean <= -6.57999 )
								if( media_azul <= 37.927 )
									ret := -0.340278
								if( media_azul > 37.927 )
									ret := -0.071166
							if( azul_mean > -6.57999 )
								if( pvimax <= 0.912632 )
									ret := -0.090718
								if( pvimax > 0.912632 )
									ret := 0.139284
				if( oscp > 4.39025 )
					if( pvi_ema <= 0.944822 )
						if( azul <= -1.31678 )
							if( xmf <= 79.7451 )
								if( verde <= 53.0052 )
									ret := 0.040392
								if( verde > 53.0052 )
									ret := -0.130844
							if( xmf > 79.7451 )
								if( marron_mean <= 48.9781 )
									ret := 0.812500 // buy
								if( marron_mean > 48.9781 )
									ret := 0.146667
						if( azul > -1.31678 )
							if( nvi <= -0.046292 )
								if( verde <= 64.4358 )
									ret := -0.557143
								if( verde > 64.4358 )
									ret := -0.274390
							if( nvi > -0.046292 )
								if( verde_mean <= 91.5515 )
									ret := 0.118483
								if( verde_mean > 91.5515 )
									ret := -0.785714 // sell
					if( pvi_ema > 0.944822 )
						if( source <= 163.259 )
							if( pvimin <= 0.947072 )
								ret := 0.117647
							if( pvimin > 0.947072 )
								if( source <= 159.928 )
									ret := 0.640000
								if( source > 159.928 )
									ret := 1.000000 // buy
						if( source > 163.259 )
							if( nvimin <= -0.34261 )
								ret := 0.687500
							if( nvimin > -0.34261 )
								if( media <= 37.6391 )
									ret := -0.683333
								if( media > 37.6391 )
									ret := -0.363167
			if( stoc > 48.9097 )
				if( nvi_ema <= -0.32316 )
					if( xrsi <= 84.2315 )
						if( verde_azul <= 131.034 )
							if( pvim <= 0.697253 )
								if( pvim <= 0.674426 )
									ret := 0.000000
								if( pvim > 0.674426 )
									ret := 0.949153 // buy
							if( pvim > 0.697253 )
								if( pvi_ema <= 0.868482 )
									ret := 0.016129
								if( pvi_ema > 0.868482 )
									ret := 0.263819
						if( verde_azul > 131.034 )
							if( nvi_ema <= -0.344967 )
								if( xrsi <= 65.8798 )
									ret := 0.111111
								if( xrsi > 65.8798 )
									ret := -0.871795 // sell
							if( nvi_ema > -0.344967 )
								if( marron_mean <= 100.148 )
									ret := -0.312500
								if( marron_mean > 100.148 )
									ret := 0.263566
					if( xrsi > 84.2315 )
						if( BollOsc <= 47.9177 )
							if( nvi <= -0.329937 )
								ret := 0.000000
							if( nvi > -0.329937 )
								ret := 0.615385
						if( BollOsc > 47.9177 )
							if( nvi_ema <= -0.325056 )
								if( nvimax <= -0.328868 )
									ret := 0.526316
								if( nvimax > -0.328868 )
									ret := 0.957746 // buy
							if( nvi_ema > -0.325056 )
								ret := 0.125000
				if( nvi_ema > -0.32316 )
					if( pvimin <= 0.561204 )
						if( verde_media <= 7.6128 )
							if( nvimax <= 0.038189 )
								if( verde_mean <= 81.4666 )
									ret := 0.075603
								if( verde_mean > 81.4666 )
									ret := -0.072216
							if( nvimax > 0.038189 )
								if( oscp <= -10.0387 )
									ret := -0.243697
								if( oscp > -10.0387 )
									ret := 0.300347
						if( verde_media > 7.6128 )
							if( pvimax <= 0.238105 )
								if( nvimin <= -0.120293 )
									ret := 0.622995
								if( nvimin > -0.120293 )
									ret := 0.096286
							if( pvimax > 0.238105 )
								if( stoc <= 73.789 )
									ret := 0.158851
								if( stoc > 73.789 )
									ret := 0.050385
					if( pvimin > 0.561204 )
						if( verde <= 62.485 )
							if( pvimax <= 1.0353 )
								if( pvi_ema <= 0.83716 )
									ret := 0.101296
								if( pvi_ema > 0.83716 )
									ret := -0.028986
							if( pvimax > 1.0353 )
								if( nvimax <= -0.110312 )
									ret := 0.151786
								if( nvimax > -0.110312 )
									ret := 0.762295 // buy
						if( verde > 62.485 )
							if( oscp <= -2.2814 )
								if( source <= 132.382 )
									ret := 0.572289
								if( source > 132.382 )
									ret := 0.077019
							if( oscp > -2.2814 )
								if( oscp <= 92.2204 )
									ret := -0.040866
								if( oscp > 92.2204 )
									ret := 0.217021
		if( verde_mean > 211.86 )
			if( source <= 113.942 )
				if( tprice <= 100.579 )
					if( verde_mean <= 240.935 )
						if( xrsi <= 79.4414 )
							ret := -1.000000 // sell
						if( xrsi > 79.4414 )
							ret := -0.700000 // sell
					if( verde_mean > 240.935 )
						ret := 0.555556
				if( tprice > 100.579 )
					if( verde_media <= 116.227 )
						if( nvi <= -0.188988 )
							if( xrsi <= 78.7632 )
								ret := -0.187500
							if( xrsi > 78.7632 )
								ret := 0.785714 // buy
						if( nvi > -0.188988 )
							if( source <= 107.964 )
								ret := 0.111111
							if( source > 107.964 )
								if( tprice <= 110.979 )
									ret := -0.857143 // sell
								if( tprice > 110.979 )
									ret := -0.500000
					if( verde_media > 116.227 )
						if( media_azul <= 79.9692 )
							if( pvi_ema <= 0.384294 )
								ret := 0.153846
							if( pvi_ema > 0.384294 )
								ret := 1.000000 // buy
						if( media_azul > 79.9692 )
							if( nvimax <= -0.18272 )
								if( nvi <= -0.223659 )
									ret := -0.909091 // sell
								if( nvi > -0.223659 )
									ret := -0.454545
							if( nvimax > -0.18272 )
								if( nvim <= -0.18046 )
									ret := 1.000000 // buy
								if( nvim > -0.18046 )
									ret := 0.258065
			if( source > 113.942 )
				if( pvim <= 0.469434 )
					if( azul <= -65.9557 )
						ret := -0.500000
					if( azul > -65.9557 )
						if( azul_mean <= 28.3836 )
							ret := -1.000000 // sell
						if( azul_mean > 28.3836 )
							ret := -0.777778 // sell
				if( pvim > 0.469434 )
					if( pvi <= 0.921113 )
						if( pvi <= 0.889186 )
							if( BollOsc <= 57.1197 )
								if( verde_azul <= 81.4372 )
									ret := -0.875000 // sell
								if( verde_azul > 81.4372 )
									ret := 0.103704
							if( BollOsc > 57.1197 )
								if( pvimin <= 0.682016 )
									ret := -0.263736
								if( pvimin > 0.682016 )
									ret := -0.755556 // sell
						if( pvi > 0.889186 )
							if( pvi <= 0.906055 )
								if( verde <= 210.648 )
									ret := 1.000000 // buy
								if( verde > 210.648 )
									ret := 0.444444
							if( pvi > 0.906055 )
								ret := 0.000000
					if( pvi > 0.921113 )
						if( oscp <= 62.9859 )
							ret := -0.272727
						if( oscp > 62.9859 )
							if( media_azul <= 73.3877 )
								if( media <= 80.3379 )
									ret := -0.111111
								if( media > 80.3379 )
									ret := -0.727273 // sell
							if( media_azul > 73.3877 )
								if( tprice <= 166.818 )
									ret := -0.900000 // sell
								if( tprice > 166.818 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMD_5Min_18c26c0d(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


