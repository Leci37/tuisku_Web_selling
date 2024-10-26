//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: AAVEUSDT_30Min_1SQU_72d444e9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1SQU_72d444e9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_72d444e9(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis <= 378.794 )
		if( priceRange <= 8.33178 )
			if( lowerBB <= 83.6367 )
				if( basis <= 45.8844 )
					if( lowerKC <= 39.608 )
						if( priceRange <= 0.38856 )
							if( upperBB <= 40.6686 )
								if( upperBB <= 28.1511 )
									ret := 0.833333 // buy
								if( upperBB > 28.1511 )
									ret := -0.464844
							if( upperBB > 40.6686 )
								if( upperKC <= 41.2601 )
									ret := 0.333333
								if( upperKC > 41.2601 )
									ret := 1.000000 // buy
						if( priceRange > 0.38856 )
							if( upperBB <= 30.3095 )
								if( priceRange <= 0.514138 )
									ret := 0.037037
								if( priceRange > 0.514138 )
									ret := 0.651515
							if( upperBB > 30.3095 )
								if( rangema <= 0.9279 )
									ret := -0.026316
								if( rangema > 0.9279 )
									ret := 0.654676
					if( lowerKC > 39.608 )
						if( priceRange <= 0.584789 )
							if( dev <= 0.590437 )
								if( lowerBB <= 39.8897 )
									ret := -0.564103
								if( lowerBB > 39.8897 )
									ret := -0.884615 // sell
							if( dev > 0.590437 )
								if( avgHighLow <= 40.7923 )
									ret := 0.090909
								if( avgHighLow > 40.7923 )
									ret := -0.620690
						if( priceRange > 0.584789 )
							if( val <= 0.004615 )
								if( lowerBB <= 40.4127 )
									ret := -0.142857
								if( lowerBB > 40.4127 )
									ret := 0.437500
							if( val > 0.004615 )
								if( avgHighLow <= 40.8607 )
									ret := -0.083333
								if( avgHighLow > 40.8607 )
									ret := -0.783505 // sell
				if( basis > 45.8844 )
					if( lowerBB <= 54.3634 )
						if( basis <= 54.6548 )
							if( lowerKC <= 45.2188 )
								if( dev <= 2.16501 )
									ret := 1.000000 // buy
								if( dev > 2.16501 )
									ret := 0.642857
							if( lowerKC > 45.2188 )
								if( sqzOnInt <= 0.5 )
									ret := 0.036709
								if( sqzOnInt > 0.5 )
									ret := 0.170261
						if( basis > 54.6548 )
							if( lowerKC <= 53.334 )
								if( dev <= 4.47775 )
									ret := 0.902655 // buy
								if( dev > 4.47775 )
									ret := 0.000000
							if( lowerKC > 53.334 )
								if( basis <= 56.6986 )
									ret := 0.434896
								if( basis > 56.6986 )
									ret := 0.019802
					if( lowerBB > 54.3634 )
						if( upperBB <= 80.8701 )
							if( dev <= 4.73079 )
								if( avgHighLow <= 75.6344 )
									ret := 0.043504
								if( avgHighLow > 75.6344 )
									ret := -0.059555
							if( dev > 4.73079 )
								if( upperBB <= 76.6047 )
									ret := -0.584795
								if( upperBB > 76.6047 )
									ret := -0.119048
						if( upperBB > 80.8701 )
							if( avgHighLow <= 79.5773 )
								if( ma <= 79.0201 )
									ret := 0.207006
								if( ma > 79.0201 )
									ret := 0.618243
							if( avgHighLow > 79.5773 )
								if( priceRange <= 4.17783 )
									ret := 0.074704
								if( priceRange > 4.17783 )
									ret := -0.439560
			if( lowerBB > 83.6367 )
				if( dev <= 6.99625 )
					if( rangema <= 0.664996 )
						if( upperBB <= 92.0601 )
							if( dev <= 0.628559 )
								if( ma <= 84.4382 )
									ret := 0.785714 // buy
								if( ma > 84.4382 )
									ret := -0.071895
							if( dev > 0.628559 )
								if( priceRange <= 0.41075 )
									ret := 0.104869
								if( priceRange > 0.41075 )
									ret := 0.309809
						if( upperBB > 92.0601 )
							if( avgHighLow <= 93.8575 )
								if( ma <= 93.747 )
									ret := -0.110831
								if( ma > 93.747 )
									ret := -0.972222 // sell
							if( avgHighLow > 93.8575 )
								if( upperKC <= 97.031 )
									ret := 0.418079
								if( upperKC > 97.031 )
									ret := 0.000000
					if( rangema > 0.664996 )
						if( avgHighLow <= 84.1997 )
							if( lowerBB <= 83.7558 )
								if( basis <= 84.7494 )
									ret := -0.800000 // sell
								if( basis > 84.7494 )
									ret := -1.000000 // sell
							if( lowerBB > 83.7558 )
								ret := -0.611111
						if( avgHighLow > 84.1997 )
							if( avgHighLow <= 380.077 )
								if( sqzOffInt <= 0.5 )
									ret := -0.013052
								if( sqzOffInt > 0.5 )
									ret := -0.068145
							if( avgHighLow > 380.077 )
								if( lowerBB <= 372.873 )
									ret := 1.000000 // buy
								if( lowerBB > 372.873 )
									ret := 0.500000
				if( dev > 6.99625 )
					if( upperBB <= 337.071 )
						if( lowerKC <= 311.166 )
							if( lowerBB <= 91.2526 )
								if( upperBB <= 103.213 )
									ret := 0.083333
								if( upperBB > 103.213 )
									ret := -0.945455 // sell
							if( lowerBB > 91.2526 )
								if( lowerKC <= 110.455 )
									ret := 0.358553
								if( lowerKC > 110.455 )
									ret := 0.072270
						if( lowerKC > 311.166 )
							if( basis <= 320.553 )
								if( lowerBB <= 311.455 )
									ret := 0.817204 // buy
								if( lowerBB > 311.455 )
									ret := 0.200000
							if( basis > 320.553 )
								if( ma <= 324.476 )
									ret := 0.138889
								if( ma > 324.476 )
									ret := 0.503704
					if( upperBB > 337.071 )
						if( upperKC <= 360.068 )
							if( basis <= 342.601 )
								if( lowerBB <= 324.109 )
									ret := -0.295826
								if( lowerBB > 324.109 )
									ret := 0.038235
							if( basis > 342.601 )
								if( upperBB <= 360.728 )
									ret := -0.417722
								if( upperBB > 360.728 )
									ret := -0.813559 // sell
						if( upperKC > 360.068 )
							if( upperKC <= 367.97 )
								if( rangema <= 7.1205 )
									ret := 0.607955
								if( rangema > 7.1205 )
									ret := -0.197183
							if( upperKC > 367.97 )
								if( upperKC <= 369.646 )
									ret := -0.482143
								if( upperKC > 369.646 )
									ret := 0.072177
		if( priceRange > 8.33178 )
			if( lowerKC <= 259.582 )
				if( rangema <= 6.27429 )
					if( ma <= 243.579 )
						if( upperBB <= 235.981 )
							if( upperBB <= 220.793 )
								if( basis <= 204.808 )
									ret := 0.313609
								if( basis > 204.808 )
									ret := 1.000000 // buy
							if( upperBB > 220.793 )
								if( lowerBB <= 211.945 )
									ret := -0.750000 // sell
								if( lowerBB > 211.945 )
									ret := 0.272727
						if( upperBB > 235.981 )
							if( upperKC <= 248.143 )
								ret := 0.900000 // buy
							if( upperKC > 248.143 )
								ret := 1.000000 // buy
					if( ma > 243.579 )
						if( lowerBB <= 244.329 )
							if( dev <= 9.14926 )
								ret := -1.000000 // sell
							if( dev > 9.14926 )
								ret := -0.500000
						if( lowerBB > 244.329 )
							if( lowerBB <= 254.637 )
								ret := 0.071429
							if( lowerBB > 254.637 )
								ret := 1.000000 // buy
				if( rangema > 6.27429 )
					if( avgHighLow <= 257.795 )
						if( sqzOnInt <= 0.5 )
							if( priceRange <= 11.7346 )
								ret := 1.000000 // buy
							if( priceRange > 11.7346 )
								if( ma <= 231.596 )
									ret := 1.000000 // buy
								if( ma > 231.596 )
									ret := 0.900000 // buy
						if( sqzOnInt > 0.5 )
							if( ma <= 245.024 )
								ret := 0.333333
							if( ma > 245.024 )
								if( upperKC <= 261.294 )
									ret := 1.000000 // buy
								if( upperKC > 261.294 )
									ret := 0.909091 // buy
					if( avgHighLow > 257.795 )
						if( avgHighLow <= 264.223 )
							ret := -0.562500
						if( avgHighLow > 264.223 )
							if( upperKC <= 282.33 )
								if( lowerKC <= 258.144 )
									ret := 0.777778 // buy
								if( lowerKC > 258.144 )
									ret := 1.000000 // buy
							if( upperKC > 282.33 )
								ret := 0.416667
			if( lowerKC > 259.582 )
				if( basis <= 282.034 )
					if( val <= 0.000553 )
						if( lowerBB <= 267.507 )
							ret := 1.000000 // buy
						if( lowerBB > 267.507 )
							ret := -0.222222
					if( val > 0.000553 )
						if( sqzOffInt <= 0.5 )
							if( val <= 0.755342 )
								if( basis <= 270.542 )
									ret := -0.500000
								if( basis > 270.542 )
									ret := -0.975000 // sell
							if( val > 0.755342 )
								ret := 0.090909
						if( sqzOffInt > 0.5 )
							ret := 0.200000
				if( basis > 282.034 )
					if( avgHighLow <= 294.334 )
						if( upperBB <= 295.857 )
							if( ma <= 284.989 )
								ret := 0.545455
							if( ma > 284.989 )
								ret := 1.000000 // buy
						if( upperBB > 295.857 )
							if( lowerKC <= 283.087 )
								if( upperKC <= 307.143 )
									ret := 0.242424
								if( upperKC > 307.143 )
									ret := 0.818182 // buy
							if( lowerKC > 283.087 )
								if( rangema <= 5.76675 )
									ret := 0.583333
								if( rangema > 5.76675 )
									ret := 1.000000 // buy
					if( avgHighLow > 294.334 )
						if( lowerBB <= 284.292 )
							if( upperKC <= 325.754 )
								if( val <= 0.927999 )
									ret := -0.697674
								if( val > 0.927999 )
									ret := 0.307692
							if( upperKC > 325.754 )
								ret := -1.000000 // sell
						if( lowerBB > 284.292 )
							if( dev <= 15.5379 )
								if( rangema <= 7.97218 )
									ret := 0.247967
								if( rangema > 7.97218 )
									ret := -0.340249
							if( dev > 15.5379 )
								if( upperBB <= 377.407 )
									ret := 0.593176
								if( upperBB > 377.407 )
									ret := 0.122596
	if( basis > 378.794 )
		if( lowerKC <= 378.236 )
			if( dev <= 47.1747 )
				if( upperBB <= 408.191 )
					if( rangema <= 4.59198 )
						if( val <= 0.291503 )
							if( upperBB <= 389.704 )
								if( avgHighLow <= 380.89 )
									ret := -0.884615 // sell
								if( avgHighLow > 380.89 )
									ret := -1.000000 // sell
							if( upperBB > 389.704 )
								ret := -0.625000
						if( val > 0.291503 )
							ret := -0.250000
					if( rangema > 4.59198 )
						if( upperBB <= 391.07 )
							if( ma <= 379.393 )
								if( priceRange <= 5.85016 )
									ret := -0.939394 // sell
								if( priceRange > 5.85016 )
									ret := 0.000000
							if( ma > 379.393 )
								if( avgHighLow <= 382.204 )
									ret := 0.071770
								if( avgHighLow > 382.204 )
									ret := 0.558140
						if( upperBB > 391.07 )
							if( upperKC <= 393.816 )
								if( lowerBB <= 367.931 )
									ret := -0.140845
								if( lowerBB > 367.931 )
									ret := -0.604167
							if( upperKC > 393.816 )
								if( lowerKC <= 367.834 )
									ret := -0.807692 // sell
								if( lowerKC > 367.834 )
									ret := -0.133172
				if( upperBB > 408.191 )
					if( avgHighLow <= 388.914 )
						if( val <= -2.81137 )
							ret := -0.333333
						if( val > -2.81137 )
							if( lowerBB <= 364.196 )
								ret := -1.000000 // sell
							if( lowerBB > 364.196 )
								if( rangema <= 12.9871 )
									ret := -0.625000
								if( rangema > 12.9871 )
									ret := -0.909091 // sell
					if( avgHighLow > 388.914 )
						ret := -0.428571
			if( dev > 47.1747 )
				ret := 1.000000 // buy
		if( lowerKC > 378.236 )
			if( lowerKC <= 509.293 )
				if( priceRange <= 13.2018 )
					if( ma <= 387.727 )
						if( upperBB <= 393.511 )
							if( sqzOnInt <= 0.5 )
								ret := -0.727273 // sell
							if( sqzOnInt > 0.5 )
								if( lowerBB <= 380.782 )
									ret := 0.594595
								if( lowerBB > 380.782 )
									ret := -0.181818
						if( upperBB > 393.511 )
							if( avgHighLow <= 385.705 )
								ret := 0.222222
							if( avgHighLow > 385.705 )
								if( val <= 0.10004 )
									ret := 1.000000 // buy
								if( val > 0.10004 )
									ret := 0.681818
					if( ma > 387.727 )
						if( ma <= 514.96 )
							if( basis <= 501.92 )
								if( upperBB <= 408.432 )
									ret := 0.077670
								if( upperBB > 408.432 )
									ret := -0.161114
							if( basis > 501.92 )
								if( rangema <= 8.7733 )
									ret := -1.000000 // sell
								if( rangema > 8.7733 )
									ret := -0.776596 // sell
						if( ma > 514.96 )
							if( upperBB <= 548.981 )
								if( upperBB <= 535.221 )
									ret := 0.253623
								if( upperBB > 535.221 )
									ret := 0.717391 // buy
							if( upperBB > 548.981 )
								ret := -0.647059
				if( priceRange > 13.2018 )
					if( val <= 3.64914 )
						if( dev <= 10.9141 )
							if( rangema <= 7.05161 )
								if( lowerKC <= 406.768 )
									ret := 0.500000
								if( lowerKC > 406.768 )
									ret := -0.230769
							if( rangema > 7.05161 )
								if( priceRange <= 17.0545 )
									ret := 0.813333 // buy
								if( priceRange > 17.0545 )
									ret := 0.200000
						if( dev > 10.9141 )
							if( lowerBB <= 501.753 )
								if( rangema <= 54.6183 )
									ret := 0.128848
								if( rangema > 54.6183 )
									ret := -0.838710 // sell
							if( lowerBB > 501.753 )
								if( basis <= 517.564 )
									ret := 0.615385
								if( basis > 517.564 )
									ret := 0.956522 // buy
					if( val > 3.64914 )
						ret := 1.000000 // buy
			if( lowerKC > 509.293 )
				if( sqzOnInt <= 0.5 )
					if( lowerBB <= 503.935 )
						if( rangema <= 16.1471 )
							ret := -0.900000 // sell
						if( rangema > 16.1471 )
							ret := -1.000000 // sell
					if( lowerBB > 503.935 )
						if( priceRange <= 11.5162 )
							if( avgHighLow <= 576.925 )
								if( avgHighLow <= 560.742 )
									ret := -0.697674
								if( avgHighLow > 560.742 )
									ret := 0.800000 // buy
							if( avgHighLow > 576.925 )
								ret := -0.913043 // sell
						if( priceRange > 11.5162 )
							if( upperBB <= 587.691 )
								if( lowerKC <= 528.939 )
									ret := 0.732143 // buy
								if( lowerKC > 528.939 )
									ret := 0.125000
							if( upperBB > 587.691 )
								if( priceRange <= 18.0807 )
									ret := 0.580645
								if( priceRange > 18.0807 )
									ret := -0.406780
				if( sqzOnInt > 0.5 )
					if( val <= -2.7739 )
						ret := 0.250000
					if( val > -2.7739 )
						if( lowerBB <= 538.878 )
							if( upperKC <= 549.646 )
								if( upperKC <= 538.584 )
									ret := -0.666667
								if( upperKC > 538.584 )
									ret := -0.914286 // sell
							if( upperKC > 549.646 )
								if( upperBB <= 549.741 )
									ret := 0.892857 // buy
								if( upperBB > 549.741 )
									ret := -0.083333
						if( lowerBB > 538.878 )
							if( val <= -0.726591 )
								if( upperBB <= 661.595 )
									ret := -0.703704 // sell
								if( upperBB > 661.595 )
									ret := 1.000000 // buy
							if( val > -0.726591 )
								if( priceRange <= 14.04 )
									ret := -0.894737 // sell
								if( priceRange > 14.04 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_AAVEUSDT_30Min_72d444e9(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


