//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: NVDA_5Min_1KON_f2d023ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_1KON_f2d023ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_f2d023ad(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( stoc <= 71.6937 )
		if( media <= 42.4825 )
			if( nvimin <= -0.093577 )
				if( media_azul <= 70.7381 )
					if( verde_azul <= 23.9154 )
						if( source <= 617.784 )
							if( tprice <= 474.698 )
								ret := -0.099787
							if( tprice > 474.698 )
								ret := 0.070398
						if( source > 617.784 )
							if( media <= 17.7038 )
								ret := 0.275862
							if( media > 17.7038 )
								ret := -0.834862 // sell
					if( verde_azul > 23.9154 )
						if( azul_mean <= -7.25141 )
							if( nvi_ema <= -0.224455 )
								ret := -0.904762 // sell
							if( nvi_ema > -0.224455 )
								ret := 0.239445
						if( azul_mean > -7.25141 )
							if( nvimax <= -0.197368 )
								ret := 0.298319
							if( nvimax > -0.197368 )
								ret := -0.057570
				if( media_azul > 70.7381 )
					if( verde_mean <= 37.1035 )
						if( pvim <= 0.744555 )
							if( oscp <= -11.0592 )
								ret := 0.483333
							if( oscp > -11.0592 )
								ret := -0.137255
						if( pvim > 0.744555 )
							if( pvi_ema <= 0.885246 )
								ret := -0.551839
							if( pvi_ema > 0.885246 )
								ret := 0.720000 // buy
					if( verde_mean > 37.1035 )
						if( xmf <= 58.4525 )
							if( pvim <= 0.730371 )
								ret := -0.936000 // sell
							if( pvim > 0.730371 )
								ret := -0.576271
						if( xmf > 58.4525 )
							if( verde_azul <= 107.843 )
								ret := 0.000000
							if( verde_azul > 107.843 )
								ret := 0.857143 // buy
			if( nvimin > -0.093577 )
				if( nvimin <= 1.11798 )
					if( nvimin <= 0.087052 )
						if( stoc <= 15.6499 )
							if( pvimax <= 1.00259 )
								ret := 0.068223
							if( pvimax > 1.00259 )
								ret := 0.539763
						if( stoc > 15.6499 )
							if( marron_mean <= 36.0699 )
								ret := -0.040553
							if( marron_mean > 36.0699 )
								ret := 0.317992
					if( nvimin > 0.087052 )
						if( marron <= -17.107 )
							if( nvimin <= 0.133603 )
								ret := -0.202020
							if( nvimin > 0.133603 )
								ret := 0.652850
						if( marron > -17.107 )
							if( azul_mean <= 66.8083 )
								ret := 0.008012
							if( azul_mean > 66.8083 )
								ret := 0.682292
				if( nvimin > 1.11798 )
					if( pvi <= -0.358541 )
						ret := 0.600000
					if( pvi > -0.358541 )
						if( verde_mean <= -91.1794 )
							ret := 0.000000
						if( verde_mean > -91.1794 )
							if( BollOsc <= -19.9022 )
								ret := -1.000000 // sell
							if( BollOsc > -19.9022 )
								ret := -0.666667
		if( media > 42.4825 )
			if( xrsi <= 27.311 )
				if( azul_mean <= 10.966 )
					if( xmf <= 50.0806 )
						if( nvimin <= -0.217415 )
							if( xrsi <= 21.7299 )
								ret := 1.000000 // buy
							if( xrsi > 21.7299 )
								ret := 0.250000
						if( nvimin > -0.217415 )
							if( verde <= -266.992 )
								ret := 1.000000 // buy
							if( verde > -266.992 )
								ret := -0.521053
					if( xmf > 50.0806 )
						if( marron_mean <= 56.7036 )
							if( nvi_ema <= -0.199446 )
								ret := -0.500000
							if( nvi_ema > -0.199446 )
								ret := 0.031250
						if( marron_mean > 56.7036 )
							if( media <= 79.4543 )
								ret := 0.750000 // buy
							if( media > 79.4543 )
								ret := 0.000000
				if( azul_mean > 10.966 )
					if( oscp <= -70.757 )
						if( pvi_ema <= 0.712185 )
							if( verde <= -163.335 )
								ret := 0.750000 // buy
							if( verde > -163.335 )
								ret := 1.000000 // buy
						if( pvi_ema > 0.712185 )
							ret := 0.200000
					if( oscp > -70.757 )
						ret := -0.600000
			if( xrsi > 27.311 )
				if( oscp <= -22.5642 )
					if( source <= 900.031 )
						if( media <= 90.8464 )
							if( source <= 289.445 )
								ret := -0.288907
							if( source > 289.445 )
								ret := -0.099805
						if( media > 90.8464 )
							if( verde_azul <= -7.28976 )
								ret := 0.885714 // buy
							if( verde_azul > -7.28976 )
								ret := 0.064516
					if( source > 900.031 )
						if( nvimin <= 0.145235 )
							if( nvimax <= 0.087048 )
								ret := 0.076923
							if( nvimax > 0.087048 )
								ret := -0.717770 // sell
						if( nvimin > 0.145235 )
							if( source <= 1203.26 )
								ret := 0.647059
							if( source > 1203.26 )
								ret := -0.379310
				if( oscp > -22.5642 )
					if( marron <= 3.27822 )
						if( media_azul <= 71.2371 )
							if( marron_mean <= 43.9787 )
								ret := 0.585987
							if( marron_mean > 43.9787 )
								ret := -0.777778 // sell
						if( media_azul > 71.2371 )
							if( verde_mean <= 19.4765 )
								ret := -0.634146
							if( verde_mean > 19.4765 )
								ret := 0.305882
					if( marron > 3.27822 )
						if( azul <= 16.1812 )
							if( pvi <= -0.331598 )
								ret := 0.347418
							if( pvi > -0.331598 )
								ret := -0.055927
						if( azul > 16.1812 )
							if( verde_mean <= 81.1517 )
								ret := 0.113884
							if( verde_mean > 81.1517 )
								ret := -0.115222
	if( stoc > 71.6937 )
		if( oscp <= 19.974 )
			if( BollOsc <= 43.2992 )
				if( marron <= 98.2704 )
					if( pvimin <= 1.11101 )
						if( verde_azul <= 110.428 )
							if( tprice <= 100.282 )
								ret := -0.777778 // sell
							if( tprice > 100.282 )
								ret := 0.038258
						if( verde_azul > 110.428 )
							if( tprice <= 829.307 )
								ret := 0.235110
							if( tprice > 829.307 )
								ret := -0.580000
					if( pvimin > 1.11101 )
						if( xmf <= 64.1925 )
							if( azul_mean <= -22.2829 )
								ret := -0.500000
							if( azul_mean > -22.2829 )
								ret := 0.258663
						if( xmf > 64.1925 )
							if( azul <= -15.4139 )
								ret := 0.467532
							if( azul > -15.4139 )
								ret := -0.004644
				if( marron > 98.2704 )
					if( pvimax <= -0.143127 )
						if( verde_media <= 25.732 )
							if( tprice <= 117.911 )
								ret := 0.611111
							if( tprice > 117.911 )
								ret := 0.174863
						if( verde_media > 25.732 )
							if( verde <= 122.365 )
								ret := 0.037037
							if( verde > 122.365 )
								ret := -0.676471
					if( pvimax > -0.143127 )
						if( nvi <= 0.289356 )
							if( verde_media <= 11.1333 )
								ret := 0.106383
							if( verde_media > 11.1333 )
								ret := -0.048202
						if( nvi > 0.289356 )
							if( verde_media <= 2.70458 )
								ret := -0.760563 // sell
							if( verde_media > 2.70458 )
								ret := -0.247851
			if( BollOsc > 43.2992 )
				if( nvi <= -0.160565 )
					if( pvimax <= 0.754057 )
						if( xrsi <= 84.6541 )
							if( tprice <= 446.708 )
								ret := 0.356890
							if( tprice > 446.708 )
								ret := 0.746377 // buy
						if( xrsi > 84.6541 )
							if( verde_mean <= 127.504 )
								ret := 0.526316
							if( verde_mean > 127.504 )
								ret := -0.487805
					if( pvimax > 0.754057 )
						if( pvimin <= 0.839656 )
							if( oscp <= 7.06554 )
								ret := 0.294643
							if( oscp > 7.06554 )
								ret := -0.157635
						if( pvimin > 0.839656 )
							if( xmf <= 52.8239 )
								ret := -0.100000
							if( xmf > 52.8239 )
								ret := 0.716049 // buy
				if( nvi > -0.160565 )
					if( verde_mean <= 119.992 )
						if( pvimax <= 1.17194 )
							if( source <= 848.703 )
								ret := 0.187970
							if( source > 848.703 )
								ret := -0.209877
						if( pvimax > 1.17194 )
							if( nvi_ema <= 0.215156 )
								ret := 0.447154
							if( nvi_ema > 0.215156 )
								ret := -0.625000
					if( verde_mean > 119.992 )
						if( oscp <= 11.4026 )
							if( verde_media <= 24.4242 )
								ret := 0.024272
							if( verde_media > 24.4242 )
								ret := 0.441441
						if( oscp > 11.4026 )
							if( source <= 122.416 )
								ret := -0.589041
							if( source > 122.416 )
								ret := -0.013774
		if( oscp > 19.974 )
			if( pvimax <= 1.36919 )
				if( media <= 81.747 )
					if( tprice <= 120.117 )
						if( marron_mean <= 71.5548 )
							if( pvi_ema <= 0.159259 )
								ret := -0.511111
							if( pvi_ema > 0.159259 )
								ret := 0.818182 // buy
						if( marron_mean > 71.5548 )
							if( marron <= 99.937 )
								ret := 0.784000 // buy
							if( marron > 99.937 )
								ret := 0.302817
					if( tprice > 120.117 )
						if( source <= 664.404 )
							if( azul_mean <= -61.6643 )
								ret := 0.729730 // buy
							if( azul_mean > -61.6643 )
								ret := -0.026140
						if( source > 664.404 )
							if( pvimax <= 1.0995 )
								ret := 0.783133 // buy
							if( pvimax > 1.0995 )
								ret := 0.189338
				if( media > 81.747 )
					if( verde_mean <= 229.295 )
						if( tprice <= 106.045 )
							if( tprice <= 101.16 )
								ret := 0.571429
							if( tprice > 101.16 )
								ret := -0.780488 // sell
						if( tprice > 106.045 )
							if( pvi <= 0.465427 )
								ret := 0.087223
							if( pvi > 0.465427 )
								ret := -0.078512
					if( verde_mean > 229.295 )
						if( azul <= -39.1503 )
							if( xmf <= 78.2014 )
								ret := 0.200000
							if( xmf > 78.2014 )
								ret := -1.000000 // sell
						if( azul > -39.1503 )
							if( source <= 321.186 )
								ret := 0.055556
							if( source > 321.186 )
								ret := 0.735849 // buy
			if( pvimax > 1.36919 )
				if( pvi <= 1.38218 )
					if( media_azul <= 104.534 )
						if( stoc <= 79.6021 )
							if( azul_mean <= -4.22569 )
								ret := -1.000000 // sell
							if( azul_mean > -4.22569 )
								ret := 0.500000
						if( stoc > 79.6021 )
							if( nvi_ema <= 0.177435 )
								ret := -0.806452 // sell
							if( nvi_ema > 0.177435 )
								ret := -1.000000 // sell
					if( media_azul > 104.534 )
						ret := 0.200000
				if( pvi > 1.38218 )
					if( nvimax <= 0.175456 )
						if( oscp <= 22.155 )
							if( verde <= 142.33 )
								ret := 0.538462
							if( verde > 142.33 )
								ret := -1.000000 // sell
						if( oscp > 22.155 )
							if( nvimin <= 0.113429 )
								ret := -0.482759
							if( nvimin > 0.113429 )
								ret := -0.860759 // sell
					if( nvimax > 0.175456 )
						if( nvi_ema <= 0.179801 )
							if( pvi_ema <= 1.37739 )
								ret := 0.950000 // buy
							if( pvi_ema > 1.37739 )
								ret := 0.303571
						if( nvi_ema > 0.179801 )
							if( pvi <= 1.39626 )
								ret := -0.750000 // sell
							if( pvi > 1.39626 )
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
float op_operation = decision_tree_0_NVDA_5Min_f2d023ad(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


