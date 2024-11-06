//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: UBER_30Min_1KON_fcc53a6c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_30Min_1KON_fcc53a6c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_30Min_fcc53a6c(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( azul <= -23.4945 )
		if( verde_azul <= 16.3211 )
			if( media <= 65.5894 )
				if( nvi <= 0.963981 )
					if( marron <= -0.544134 )
						if( verde_mean <= -31.5257 )
							ret := 0.456000
						if( verde_mean > -31.5257 )
							ret := 0.795107 // buy
					if( marron > -0.544134 )
						if( marron_mean <= 4.57047 )
							ret := -0.500000
						if( marron_mean > 4.57047 )
							ret := 0.444444
				if( nvi > 0.963981 )
					if( stoc <= 7.87092 )
						if( xrsi <= 15.5465 )
							ret := 0.241379
						if( xrsi > 15.5465 )
							ret := -0.791667 // sell
					if( stoc > 7.87092 )
						if( marron <= -10.8819 )
							ret := 0.064748
						if( marron > -10.8819 )
							ret := 0.581967
			if( media > 65.5894 )
				if( pvimax <= -0.253763 )
					ret := -1.000000 // sell
				if( pvimax > -0.253763 )
					ret := -0.777778 // sell
		if( verde_azul > 16.3211 )
			if( verde_media <= -80.1294 )
				if( oscp <= -25.6554 )
					ret := 0.210526
				if( oscp > -25.6554 )
					if( pvimin <= -0.404036 )
						ret := -0.411765
					if( pvimin > -0.404036 )
						ret := -1.000000 // sell
			if( verde_media > -80.1294 )
				if( verde_azul <= 201.918 )
					if( verde_azul <= 137.164 )
						if( oscp <= 11.1301 )
							ret := 0.163352
						if( oscp > 11.1301 )
							ret := -0.129950
					if( verde_azul > 137.164 )
						if( tprice <= 51.9042 )
							ret := 0.404724
						if( tprice > 51.9042 )
							ret := -0.067114
				if( verde_azul > 201.918 )
					if( nvimin <= 0.074754 )
						if( oscp <= 56.6109 )
							ret := 0.153846
						if( oscp > 56.6109 )
							ret := 1.000000 // buy
					if( nvimin > 0.074754 )
						if( nvimax <= 0.986493 )
							ret := -0.492308
						if( nvimax > 0.986493 )
							ret := 0.009901
	if( azul > -23.4945 )
		if( source <= 27.1047 )
			if( nvi <= 0.951676 )
				if( xmf <= 88.8569 )
					if( marron_mean <= 75.2274 )
						if( pvi_ema <= -0.386176 )
							ret := 0.045373
						if( pvi_ema > -0.386176 )
							ret := 0.723214 // buy
					if( marron_mean > 75.2274 )
						if( azul_mean <= 6.51241 )
							ret := 0.479730
						if( azul_mean > 6.51241 )
							ret := 0.172628
				if( xmf > 88.8569 )
					if( verde_mean <= 103.687 )
						if( nvimin <= 0.887576 )
							ret := -0.596413
						if( nvimin > 0.887576 )
							ret := 0.055556
					if( verde_mean > 103.687 )
						if( media <= 100.544 )
							ret := 0.623656
						if( media > 100.544 )
							ret := -0.651163
			if( nvi > 0.951676 )
				if( xmf <= 54.4835 )
					if( marron_mean <= 12.6761 )
						ret := 0.000000
					if( marron_mean > 12.6761 )
						if( nvimin <= 0.914395 )
							ret := -0.684211
						if( nvimin > 0.914395 )
							ret := -1.000000 // sell
				if( xmf > 54.4835 )
					if( media_azul <= 63.4981 )
						ret := 0.250000
					if( media_azul > 63.4981 )
						ret := -0.764706 // sell
		if( source > 27.1047 )
			if( media <= 14.0492 )
				if( pvimax <= -0.361075 )
					if( azul_mean <= -14.0401 )
						if( verde_media <= -23.775 )
							ret := 0.855670 // buy
						if( verde_media > -23.775 )
							ret := 0.409836
					if( azul_mean > -14.0401 )
						if( xmf <= 35.9921 )
							ret := 0.247881
						if( xmf > 35.9921 )
							ret := -0.397059
				if( pvimax > -0.361075 )
					if( azul_mean <= 6.88064 )
						if( pvim <= -0.4008 )
							ret := -0.536842
						if( pvim > -0.4008 )
							ret := 0.018775
					if( azul_mean > 6.88064 )
						if( media <= 10.8939 )
							ret := -0.033708
						if( media > 10.8939 )
							ret := 0.676923
			if( media > 14.0492 )
				if( media_azul <= 47.0811 )
					if( verde_azul <= -116.687 )
						if( xmf <= 21.2851 )
							ret := 0.806452 // buy
						if( xmf > 21.2851 )
							ret := -0.224490
					if( verde_azul > -116.687 )
						if( nvi <= 0.975841 )
							ret := -0.144640
						if( nvi > 0.975841 )
							ret := -0.037979
				if( media_azul > 47.0811 )
					if( verde_media <= 41.5024 )
						if( pvimax <= -0.200928 )
							ret := -0.018679
						if( pvimax > -0.200928 )
							ret := 0.073258
					if( verde_media > 41.5024 )
						if( oscp <= 104.276 )
							ret := -0.139541
						if( oscp > 104.276 )
							ret := 0.377778
	
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
float op_operation = decision_tree_0_UBER_30Min_fcc53a6c(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


