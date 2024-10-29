//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ETHUSDT_15Min_1KON_4b719778 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1KON_4b719778", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_4b719778(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( pvi_ema <= -1.94718 )
		if( nvi <= 2.27555 )
			if( nvi <= 2.2652 )
				if( nvimin <= 2.25092 )
					ret := -0.600000
				if( nvimin > 2.25092 )
					if( azul <= -12.2068 )
						ret := -0.166667
					if( azul > -12.2068 )
						ret := 0.500000
			if( nvi > 2.2652 )
				if( source <= 2298.82 )
					if( verde_mean <= 92.0903 )
						if( pvim <= -1.98693 )
							if( pvim <= -1.98721 )
								ret := 0.250000
							if( pvim > -1.98721 )
								ret := 0.000000
						if( pvim > -1.98693 )
							if( pvimin <= -1.95477 )
								ret := 0.918919 // buy
							if( pvimin > -1.95477 )
								ret := 0.535714
					if( verde_mean > 92.0903 )
						ret := 1.000000 // buy
				if( source > 2298.82 )
					if( media_azul <= 45.6938 )
						if( verde_mean <= 27.3448 )
							ret := 0.250000
						if( verde_mean > 27.3448 )
							ret := 1.000000 // buy
					if( media_azul > 45.6938 )
						if( media_azul <= 128.877 )
							if( media_azul <= 76.2779 )
								ret := 0.100000
							if( media_azul > 76.2779 )
								ret := -0.600000
						if( media_azul > 128.877 )
							ret := 0.571429
		if( nvi > 2.27555 )
			if( pvim <= -1.96168 )
				if( tprice <= 2289.69 )
					if( media_azul <= 42.0795 )
						if( tprice <= 2271.98 )
							if( azul <= 15.8972 )
								ret := -0.076923
							if( azul > 15.8972 )
								ret := 0.857143 // buy
						if( tprice > 2271.98 )
							if( azul <= 5.71437 )
								ret := -0.761905 // sell
							if( azul > 5.71437 )
								ret := 0.000000
					if( media_azul > 42.0795 )
						if( source <= 2282.09 )
							if( xmf <= 59.4487 )
								ret := 0.903226 // buy
							if( xmf > 59.4487 )
								ret := 0.250000
						if( source > 2282.09 )
							if( azul <= -7.1582 )
								ret := 0.750000 // buy
							if( azul > -7.1582 )
								ret := 0.088235
				if( tprice > 2289.69 )
					if( nvi_ema <= 2.28395 )
						if( pvimax <= -1.94263 )
							ret := -1.000000 // sell
						if( pvimax > -1.94263 )
							if( nvi <= 2.28476 )
								ret := 0.100000
							if( nvi > 2.28476 )
								ret := -0.750000 // sell
					if( nvi_ema > 2.28395 )
						if( pvimax <= -1.9118 )
							if( marron <= 38.6049 )
								ret := 0.636364
							if( marron > 38.6049 )
								ret := -0.033333
						if( pvimax > -1.9118 )
							if( verde_mean <= 42.4162 )
								ret := 0.125000
							if( verde_mean > 42.4162 )
								ret := -0.875000 // sell
			if( pvim > -1.96168 )
				if( azul_mean <= 78.7854 )
					if( source <= 2376.38 )
						if( nvim <= 2.27634 )
							if( stoc <= 61.7673 )
								ret := 0.083333
							if( stoc > 61.7673 )
								ret := -0.888889 // sell
						if( nvim > 2.27634 )
							if( nvimax <= 2.27931 )
								ret := 0.090909
							if( nvimax > 2.27931 )
								ret := 0.885246 // buy
					if( source > 2376.38 )
						if( nvim <= 2.31957 )
							if( pvimax <= -1.92498 )
								ret := 0.046512
							if( pvimax > -1.92498 )
								ret := -0.833333 // sell
						if( nvim > 2.31957 )
							if( azul <= 6.05517 )
								ret := 0.641026
							if( azul > 6.05517 )
								ret := 0.080000
				if( azul_mean > 78.7854 )
					if( nvi <= 2.28859 )
						ret := -0.750000 // sell
					if( nvi > 2.28859 )
						ret := -1.000000 // sell
	if( pvi_ema > -1.94718 )
		if( nvimin <= -0.480096 )
			if( nvi_ema <= -0.485935 )
				if( oscp <= -6.31956 )
					ret := 1.000000 // buy
				if( oscp > -6.31956 )
					if( media_azul <= 86.9552 )
						if( marron_mean <= 44.5319 )
							ret := -0.500000
						if( marron_mean > 44.5319 )
							if( media <= 76.6602 )
								ret := -1.000000 // sell
							if( media > 76.6602 )
								ret := -0.750000 // sell
					if( media_azul > 86.9552 )
						ret := 0.000000
			if( nvi_ema > -0.485935 )
				if( nvimax <= -0.473508 )
					if( xrsi <= 50.0256 )
						if( verde <= 15.2565 )
							ret := 1.000000 // buy
						if( verde > 15.2565 )
							ret := 0.000000
					if( xrsi > 50.0256 )
						if( stoc <= 71.0056 )
							ret := -1.000000 // sell
						if( stoc > 71.0056 )
							ret := -0.285714
				if( nvimax > -0.473508 )
					if( source <= 1483.12 )
						if( media <= 119.679 )
							if( nvi_ema <= -0.466564 )
								ret := 0.621810
							if( nvi_ema > -0.466564 )
								ret := 0.105263
						if( media > 119.679 )
							if( media_azul <= 106.895 )
								ret := -1.000000 // sell
							if( media_azul > 106.895 )
								ret := -0.250000
					if( source > 1483.12 )
						if( pvi_ema <= -0.061742 )
							ret := -0.500000
						if( pvi_ema > -0.061742 )
							ret := -1.000000 // sell
		if( nvimin > -0.480096 )
			if( xmf <= 45.7616 )
				if( tprice <= 1559.73 )
					if( pvi_ema <= -0.290117 )
						if( media_azul <= 46.2326 )
							if( nvimin <= -0.450637 )
								ret := -0.550000
							if( nvimin > -0.450637 )
								ret := 0.012912
						if( media_azul > 46.2326 )
							if( source <= 1057.42 )
								ret := 0.690217
							if( source > 1057.42 )
								ret := 0.132027
					if( pvi_ema > -0.290117 )
						if( xrsi <= 44.6821 )
							if( nvi <= -0.287855 )
								ret := -0.013158
							if( nvi > -0.287855 )
								ret := 0.340000
						if( xrsi > 44.6821 )
							if( stoc <= 46.8527 )
								ret := 0.765385 // buy
							if( stoc > 46.8527 )
								ret := 0.235294
				if( tprice > 1559.73 )
					if( nvi_ema <= -0.42429 )
						if( stoc <= 64.5499 )
							ret := -1.000000 // sell
						if( stoc > 64.5499 )
							ret := -0.250000
					if( nvi_ema > -0.42429 )
						if( oscp <= -120.512 )
							if( azul_mean <= -36.1156 )
								ret := -0.096774
							if( azul_mean > -36.1156 )
								ret := 0.637795
						if( oscp > -120.512 )
							if( verde_mean <= 58.1214 )
								ret := -0.004731
							if( verde_mean > 58.1214 )
								ret := 0.075611
			if( xmf > 45.7616 )
				if( pvi <= -0.437241 )
					if( nvimin <= -0.171263 )
						if( source <= 1237.84 )
							if( media_azul <= 73.8048 )
								ret := 0.040179
							if( media_azul > 73.8048 )
								ret := -0.312413
						if( source > 1237.84 )
							if( nvim <= -0.170502 )
								ret := -0.973214 // sell
							if( nvim > -0.170502 )
								ret := 0.000000
					if( nvimin > -0.171263 )
						if( azul_mean <= 8.02321 )
							if( nvimax <= -0.091043 )
								ret := 0.254264
							if( nvimax > -0.091043 )
								ret := -0.018523
						if( azul_mean > 8.02321 )
							if( nvi_ema <= 1.78519 )
								ret := 0.086267
							if( nvi_ema > 1.78519 )
								ret := -0.043655
				if( pvi > -0.437241 )
					if( source <= 1222.61 )
						if( source <= 1181.5 )
							if( nvimax <= -0.424133 )
								ret := 0.214286
							if( nvimax > -0.424133 )
								ret := -0.290780
						if( source > 1181.5 )
							if( xrsi <= 68.0946 )
								ret := 0.434238
							if( xrsi > 68.0946 )
								ret := -0.171717
					if( source > 1222.61 )
						if( media <= 116.714 )
							if( source <= 1480.24 )
								ret := -0.366353
							if( source > 1480.24 )
								ret := -0.073053
						if( media > 116.714 )
							if( tprice <= 1899.64 )
								ret := 0.588235
							if( tprice > 1899.64 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ETHUSDT_15Min_4b719778(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


