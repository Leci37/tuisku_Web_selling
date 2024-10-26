//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: XLMUSDT_30Min_1KON_45a3ae9d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_1KON_45a3ae9d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_45a3ae9d(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -1.33672 )
		if( nvi_ema <= 0.076753 )
			if( verde_azul <= 26.2509 )
				if( verde <= 1.01305 )
					if( azul <= 7.66507 )
						if( oscp <= -17.071 )
							ret := 1.000000 // buy
						if( oscp > -17.071 )
							ret := 0.687500
					if( azul > 7.66507 )
						if( stoc <= 33.8446 )
							if( tprice <= 0.247726 )
								ret := 0.250000
							if( tprice > 0.247726 )
								ret := 0.727273 // buy
						if( stoc > 33.8446 )
							ret := -0.333333
				if( verde > 1.01305 )
					if( pvimin <= 2.26349 )
						if( nvi <= -0.179008 )
							if( nvi_ema <= -0.214643 )
								if( nvi_ema <= -0.242584 )
									ret := -0.600000
								if( nvi_ema > -0.242584 )
									ret := 0.714286 // buy
							if( nvi_ema > -0.214643 )
								ret := -0.750000 // sell
						if( nvi > -0.179008 )
							if( marron_mean <= 68.6265 )
								if( xmf <= 47.3797 )
									ret := 0.337209
								if( xmf > 47.3797 )
									ret := -0.636364
							if( marron_mean > 68.6265 )
								ret := 0.884615 // buy
					if( pvimin > 2.26349 )
						if( verde_azul <= -11.639 )
							ret := -1.000000 // sell
						if( verde_azul > -11.639 )
							ret := -0.583333
			if( verde_azul > 26.2509 )
				if( azul <= 9.72896 )
					if( azul_mean <= 9.25015 )
						if( azul <= -10.1582 )
							if( azul <= -16.7501 )
								ret := 0.928571 // buy
							if( azul > -16.7501 )
								ret := 1.000000 // buy
						if( azul > -10.1582 )
							if( verde_mean <= 78.5205 )
								if( verde_azul <= 32.7274 )
									ret := 0.384615
								if( verde_azul > 32.7274 )
									ret := 0.898734 // buy
							if( verde_mean > 78.5205 )
								if( stoc <= 58.7033 )
									ret := -0.266667
								if( stoc > 58.7033 )
									ret := 0.904762 // buy
					if( azul_mean > 9.25015 )
						ret := 0.250000
				if( azul > 9.72896 )
					if( BollOsc <= 9.0193 )
						ret := -0.500000
					if( BollOsc > 9.0193 )
						if( xmf <= 59.7565 )
							if( azul <= 21.6962 )
								if( marron_mean <= 89.5079 )
									ret := 0.307692
								if( marron_mean > 89.5079 )
									ret := 0.909091 // buy
							if( azul > 21.6962 )
								ret := -0.400000
						if( xmf > 59.7565 )
							if( media_azul <= 51.7013 )
								ret := 0.818182 // buy
							if( media_azul > 51.7013 )
								ret := 1.000000 // buy
		if( nvi_ema > 0.076753 )
			if( marron <= 68.6422 )
				if( BollOsc <= -27.0749 )
					if( azul <= -79.8525 )
						if( source <= 0.089303 )
							if( verde_media <= -65.4978 )
								ret := -0.750000 // sell
							if( verde_media > -65.4978 )
								ret := 0.444444
						if( source > 0.089303 )
							if( verde_mean <= -33.3678 )
								ret := 1.000000 // buy
							if( verde_mean > -33.3678 )
								if( pvim <= -0.975369 )
									ret := 0.083333
								if( pvim > -0.975369 )
									ret := 0.891892 // buy
					if( azul > -79.8525 )
						if( pvi_ema <= -1.65604 )
							if( azul_mean <= -4.31083 )
								if( xrsi <= 13.3636 )
									ret := 0.530303
								if( xrsi > 13.3636 )
									ret := -0.011223
							if( azul_mean > -4.31083 )
								if( verde_media <= -109.828 )
									ret := 0.374532
								if( verde_media > -109.828 )
									ret := 0.169936
						if( pvi_ema > -1.65604 )
							if( nvi_ema <= 1.49996 )
								if( tprice <= 0.67843 )
									ret := 0.142915
								if( tprice > 0.67843 )
									ret := -0.931034 // sell
							if( nvi_ema > 1.49996 )
								if( verde_media <= -28.5441 )
									ret := -0.052792
								if( verde_media > -28.5441 )
									ret := 0.086565
				if( BollOsc > -27.0749 )
					if( marron_mean <= 17.7473 )
						if( pvim <= 0.487502 )
							if( xmf <= 47.3651 )
								if( verde_mean <= 7.79049 )
									ret := -0.105911
								if( verde_mean > 7.79049 )
									ret := -0.661538
							if( xmf > 47.3651 )
								if( verde_media <= -3.15597 )
									ret := -0.944444 // sell
								if( verde_media > -3.15597 )
									ret := -0.588235
						if( pvim > 0.487502 )
							if( nvimax <= 1.86779 )
								if( verde_media <= -12.5043 )
									ret := 0.125000
								if( verde_media > -12.5043 )
									ret := -0.773196 // sell
							if( nvimax > 1.86779 )
								if( media <= 16.4496 )
									ret := -0.352941
								if( media > 16.4496 )
									ret := 0.214286
					if( marron_mean > 17.7473 )
						if( azul_mean <= 3.83826 )
							if( nvimax <= 0.486525 )
								if( verde_media <= -15.6082 )
									ret := 0.085106
								if( verde_media > -15.6082 )
									ret := 0.378753
							if( nvimax > 0.486525 )
								if( pvimin <= 1.50233 )
									ret := 0.040908
								if( pvimin > 1.50233 )
									ret := -0.304183
						if( azul_mean > 3.83826 )
							if( nvi_ema <= 1.88274 )
								if( oscp <= -10.824 )
									ret := -0.024710
								if( oscp > -10.824 )
									ret := -0.236754
							if( nvi_ema > 1.88274 )
								if( media_azul <= -45.1376 )
									ret := -0.477064
								if( media_azul > -45.1376 )
									ret := -0.003503
			if( marron > 68.6422 )
				if( pvim <= 0.665026 )
					if( verde <= 105.943 )
						if( pvi_ema <= -1.6221 )
							if( source <= 0.134652 )
								if( pvim <= -2.0321 )
									ret := 0.026482
								if( pvim > -2.0321 )
									ret := -0.183562
							if( source > 0.134652 )
								if( stoc <= 87.9972 )
									ret := 0.162304
								if( stoc > 87.9972 )
									ret := 1.000000 // buy
						if( pvi_ema > -1.6221 )
							if( BollOsc <= 6.14858 )
								if( source <= 0.153862 )
									ret := 0.138889
								if( source > 0.153862 )
									ret := 0.776471 // buy
							if( BollOsc > 6.14858 )
								if( verde_azul <= 8.68073 )
									ret := 0.548077
								if( verde_azul > 8.68073 )
									ret := 0.085960
					if( verde > 105.943 )
						if( pvim <= -2.68677 )
							ret := 0.892857 // buy
						if( pvim > -2.68677 )
							if( xrsi <= 75.8801 )
								if( verde_azul <= 83.3339 )
									ret := -0.200000
								if( verde_azul > 83.3339 )
									ret := 0.333333
							if( xrsi > 75.8801 )
								ret := 0.888889 // buy
				if( pvim > 0.665026 )
					if( verde_media <= 30.0795 )
						if( verde <= 63.0785 )
							if( marron_mean <= 86.8522 )
								if( tprice <= 0.46872 )
									ret := -0.175676
								if( tprice > 0.46872 )
									ret := 0.862069 // buy
							if( marron_mean > 86.8522 )
								if( pvimax <= 1.75378 )
									ret := -0.750000 // sell
								if( pvimax > 1.75378 )
									ret := 0.000000
						if( verde > 63.0785 )
							if( nvi <= 0.412283 )
								if( nvi_ema <= 0.127083 )
									ret := -0.307692
								if( nvi_ema > 0.127083 )
									ret := 0.806452 // buy
							if( nvi > 0.412283 )
								if( verde_azul <= 54.5732 )
									ret := 0.582524
								if( verde_azul > 54.5732 )
									ret := 0.244589
					if( verde_media > 30.0795 )
						ret := -0.850000 // sell
	if( oscp > -1.33672 )
		if( marron_mean <= 135.59 )
			if( verde_mean <= 128.204 )
				if( xrsi <= 75.407 )
					if( verde_mean <= 29.1021 )
						if( xmf <= 11.9126 )
							ret := -1.000000 // sell
						if( xmf > 11.9126 )
							if( media_azul <= -4.59715 )
								if( xmf <= 43.0663 )
									ret := 0.740000 // buy
								if( xmf > 43.0663 )
									ret := 0.083333
							if( media_azul > -4.59715 )
								if( pvi <= 2.02918 )
									ret := -0.155745
								if( pvi > 2.02918 )
									ret := 0.477273
					if( verde_mean > 29.1021 )
						if( marron <= 37.6035 )
							if( xmf <= 47.9725 )
								if( nvim <= -0.027429 )
									ret := -0.545455
								if( nvim > -0.027429 )
									ret := 0.174305
							if( xmf > 47.9725 )
								if( verde <= 43.4516 )
									ret := -0.037838
								if( verde > 43.4516 )
									ret := -0.483871
						if( marron > 37.6035 )
							if( media_azul <= 70.3103 )
								if( stoc <= 62.7381 )
									ret := -0.058388
								if( stoc > 62.7381 )
									ret := 0.037562
							if( media_azul > 70.3103 )
								if( tprice <= 0.108954 )
									ret := 0.020337
								if( tprice > 0.108954 )
									ret := -0.088955
				if( xrsi > 75.407 )
					if( source <= 0.299683 )
						if( pvimin <= -2.56903 )
							if( verde_azul <= 151.823 )
								if( stoc <= 86.9931 )
									ret := -0.789474 // sell
								if( stoc > 86.9931 )
									ret := -0.376623
							if( verde_azul > 151.823 )
								ret := 0.714286 // buy
						if( pvimin > -2.56903 )
							if( media_azul <= 45.6979 )
								if( source <= 0.11036 )
									ret := -0.200000
								if( source > 0.11036 )
									ret := -0.833333 // sell
							if( media_azul > 45.6979 )
								if( azul_mean <= 25.6071 )
									ret := -0.160944
								if( azul_mean > 25.6071 )
									ret := 0.246835
					if( source > 0.299683 )
						if( nvi_ema <= 0.515709 )
							if( nvim <= 0.375499 )
								ret := -0.454545
							if( nvim > 0.375499 )
								ret := 0.800000 // buy
						if( nvi_ema > 0.515709 )
							if( azul <= 19.701 )
								if( pvi <= 0.445227 )
									ret := -0.555556
								if( pvi > 0.445227 )
									ret := -0.852632 // sell
							if( azul > 19.701 )
								if( verde_media <= 73.1898 )
									ret := -0.162162
								if( verde_media > 73.1898 )
									ret := -0.952381 // sell
			if( verde_mean > 128.204 )
				if( verde <= 116.084 )
					if( marron <= 95.7253 )
						if( pvim <= -2.26538 )
							if( xrsi <= 57.1837 )
								ret := -0.933333 // sell
							if( xrsi > 57.1837 )
								if( pvimax <= -2.37572 )
									ret := 0.325000
								if( pvimax > -2.37572 )
									ret := -0.384615
						if( pvim > -2.26538 )
							if( verde_azul <= 231.471 )
								if( nvi_ema <= 2.70321 )
									ret := 0.687285
								if( nvi_ema > 2.70321 )
									ret := 0.419753
							if( verde_azul > 231.471 )
								ret := -0.307692
					if( marron > 95.7253 )
						if( pvimax <= 1.89412 )
							if( xrsi <= 72.8694 )
								if( xrsi <= 69.6615 )
									ret := 0.017544
								if( xrsi > 69.6615 )
									ret := -0.482759
							if( xrsi > 72.8694 )
								if( pvi_ema <= -0.083073 )
									ret := 0.897436 // buy
								if( pvi_ema > -0.083073 )
									ret := 0.454545
						if( pvimax > 1.89412 )
							if( verde_media <= 11.3174 )
								ret := 0.857143 // buy
							if( verde_media > 11.3174 )
								ret := 0.583333
				if( verde > 116.084 )
					if( media <= 108.928 )
						if( pvimin <= 1.00631 )
							if( source <= 0.084779 )
								if( nvimax <= 0.121513 )
									ret := -0.307692
								if( nvimax > 0.121513 )
									ret := 0.434783
							if( source > 0.084779 )
								if( oscp <= 30.4579 )
									ret := -0.109434
								if( oscp > 30.4579 )
									ret := 0.012390
						if( pvimin > 1.00631 )
							if( oscp <= 19.5741 )
								if( media <= 102.361 )
									ret := -0.678571
								if( media > 102.361 )
									ret := -0.961538 // sell
							if( oscp > 19.5741 )
								if( verde <= 120.687 )
									ret := 1.000000 // buy
								if( verde > 120.687 )
									ret := -0.197623
					if( media > 108.928 )
						if( xrsi <= 77.886 )
							if( nvi_ema <= 4.6745 )
								if( nvimax <= 3.27995 )
									ret := 0.709434 // buy
								if( nvimax > 3.27995 )
									ret := 0.254545
							if( nvi_ema > 4.6745 )
								if( oscp <= 30.8453 )
									ret := -0.200000
								if( oscp > 30.8453 )
									ret := -0.857143 // sell
						if( xrsi > 77.886 )
							if( stoc <= 87.6815 )
								if( stoc <= 83.7626 )
									ret := -0.158824
								if( stoc > 83.7626 )
									ret := 0.341818
							if( stoc > 87.6815 )
								if( nvi_ema <= 2.55624 )
									ret := -0.513761
								if( nvi_ema > 2.55624 )
									ret := -0.042607
		if( marron_mean > 135.59 )
			if( BollOsc <= 47.4187 )
				ret := -0.333333
			if( BollOsc > 47.4187 )
				if( tprice <= 0.160067 )
					if( media_azul <= 114.077 )
						if( source <= 0.09087 )
							ret := 0.800000 // buy
						if( source > 0.09087 )
							if( oscp <= 212.624 )
								ret := 1.000000 // buy
							if( oscp > 212.624 )
								ret := 0.800000 // buy
					if( media_azul > 114.077 )
						ret := 0.529412
				if( tprice > 0.160067 )
					if( verde_media <= 67.1847 )
						if( xrsi <= 88.6206 )
							ret := 1.000000 // buy
						if( xrsi > 88.6206 )
							ret := 0.222222
					if( verde_media > 67.1847 )
						ret := -0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XLMUSDT_30Min_45a3ae9d(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


