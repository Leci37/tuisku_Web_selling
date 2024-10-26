//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: QCOM_15Min_1SQU_8f9d8130 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_15Min_1SQU_8f9d8130", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_15Min_8f9d8130(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( val <= 0.079149 )
		if( lowerBB <= 55.1414 )
			if( rangema <= 0.107797 )
				if( val <= -0.012653 )
					if( upperBB <= 52.3763 )
						if( avgHighLow <= 50.7329 )
							ret := -0.307692
						if( avgHighLow > 50.7329 )
							if( val <= -0.020845 )
								if( val <= -0.031438 )
									ret := 0.625000
								if( val > -0.031438 )
									ret := 0.972973 // buy
							if( val > -0.020845 )
								if( avgHighLow <= 52.0125 )
									ret := 0.277778
								if( avgHighLow > 52.0125 )
									ret := 0.657895
					if( upperBB > 52.3763 )
						if( lowerBB <= 53.7389 )
							if( basis <= 53.5629 )
								if( val <= -0.016957 )
									ret := -0.028169
								if( val > -0.016957 )
									ret := 0.352113
							if( basis > 53.5629 )
								if( val <= -0.015816 )
									ret := 0.947368 // buy
								if( val > -0.015816 )
									ret := 0.538462
						if( lowerBB > 53.7389 )
							if( upperKC <= 54.1049 )
								ret := -0.769231 // sell
							if( upperKC > 54.1049 )
								if( ma <= 54.8702 )
									ret := 0.076923
								if( ma > 54.8702 )
									ret := 0.352941
				if( val > -0.012653 )
					if( upperBB <= 50.4544 )
						if( dev <= 0.12801 )
							if( basis <= 49.6926 )
								ret := 0.000000
							if( basis > 49.6926 )
								ret := 0.230769
						if( dev > 0.12801 )
							if( upperKC <= 50.233 )
								ret := 0.933333 // buy
							if( upperKC > 50.233 )
								ret := 1.000000 // buy
					if( upperBB > 50.4544 )
						if( basis <= 55.2423 )
							if( val <= 0.025936 )
								if( rangema <= 0.073253 )
									ret := 0.042553
								if( rangema > 0.073253 )
									ret := -0.184316
							if( val > 0.025936 )
								if( upperKC <= 53.884 )
									ret := 0.245902
								if( upperKC > 53.884 )
									ret := 0.857143 // buy
						if( basis > 55.2423 )
							if( basis <= 55.28 )
								ret := 0.571429
							if( basis > 55.28 )
								if( rangema <= 0.084424 )
									ret := 1.000000 // buy
								if( rangema > 0.084424 )
									ret := 0.583333
			if( rangema > 0.107797 )
				if( upperKC <= 56.2058 )
					if( avgHighLow <= 49.7288 )
						if( basis <= 49.5691 )
							ret := 0.000000
						if( basis > 49.5691 )
							if( dev <= 0.263407 )
								if( upperBB <= 49.8127 )
									ret := 0.705882 // buy
								if( upperBB > 49.8127 )
									ret := 0.969231 // buy
							if( dev > 0.263407 )
								if( val <= -0.02567 )
									ret := 0.950000 // buy
								if( val > -0.02567 )
									ret := 0.087719
					if( avgHighLow > 49.7288 )
						if( upperBB <= 52.5062 )
							if( basis <= 50.9044 )
								if( dev <= 0.47999 )
									ret := 0.207207
								if( dev > 0.47999 )
									ret := -0.144330
							if( basis > 50.9044 )
								if( avgHighLow <= 51.8312 )
									ret := -0.241002
								if( avgHighLow > 51.8312 )
									ret := 0.038610
						if( upperBB > 52.5062 )
							if( avgHighLow <= 52.6506 )
								if( dev <= 0.312284 )
									ret := 0.161943
								if( dev > 0.312284 )
									ret := 0.558824
							if( avgHighLow > 52.6506 )
								if( lowerBB <= 52.672 )
									ret := -0.103627
								if( lowerBB > 52.672 )
									ret := 0.128728
				if( upperKC > 56.2058 )
					if( basis <= 55.9791 )
						if( basis <= 55.7812 )
							ret := 0.333333
						if( basis > 55.7812 )
							if( dev <= 0.801035 )
								if( val <= -0.06071 )
									ret := 0.894737 // buy
								if( val > -0.06071 )
									ret := 0.076923
							if( dev > 0.801035 )
								if( upperKC <= 56.2951 )
									ret := 1.000000 // buy
								if( upperKC > 56.2951 )
									ret := 0.777778 // buy
					if( basis > 55.9791 )
						if( dev <= 2.28767 )
							if( upperKC <= 56.667 )
								ret := -0.315789
							if( upperKC > 56.667 )
								ret := 0.111111
						if( dev > 2.28767 )
							if( avgHighLow <= 57.6239 )
								ret := 1.000000 // buy
							if( avgHighLow > 57.6239 )
								ret := 0.125000
		if( lowerBB > 55.1414 )
			if( ma <= 69.5451 )
				if( upperKC <= 69.6348 )
					if( lowerKC <= 60.8979 )
						if( dev <= 0.174298 )
							if( rangema <= 0.114113 )
								if( lowerKC <= 58.0514 )
									ret := 0.029457
								if( lowerKC > 58.0514 )
									ret := -0.412556
							if( rangema > 0.114113 )
								if( val <= -0.000643 )
									ret := 0.035639
								if( val > -0.000643 )
									ret := 0.304183
						if( dev > 0.174298 )
							if( rangema <= 0.265979 )
								if( val <= -0.025382 )
									ret := 0.122180
								if( val > -0.025382 )
									ret := -0.123987
							if( rangema > 0.265979 )
								if( lowerKC <= 59.3451 )
									ret := -0.111616
								if( lowerKC > 59.3451 )
									ret := -0.546512
					if( lowerKC > 60.8979 )
						if( upperKC <= 62.6051 )
							if( priceRange <= 0.627279 )
								if( val <= 0.041099 )
									ret := 0.716763 // buy
								if( val > 0.041099 )
									ret := 0.000000
							if( priceRange > 0.627279 )
								if( rangema <= 0.378139 )
									ret := 0.857143 // buy
								if( rangema > 0.378139 )
									ret := -1.000000 // sell
						if( upperKC > 62.6051 )
							if( avgHighLow <= 65.6001 )
								if( rangema <= 0.428665 )
									ret := -0.007635
								if( rangema > 0.428665 )
									ret := 0.241935
							if( avgHighLow > 65.6001 )
								if( dev <= 0.518986 )
									ret := -0.118141
								if( dev > 0.518986 )
									ret := -0.003512
				if( upperKC > 69.6348 )
					if( val <= 0.016111 )
						if( rangema <= 0.4173 )
							if( rangema <= 0.313779 )
								if( upperKC <= 69.9217 )
									ret := -0.538462
								if( upperKC > 69.9217 )
									ret := -0.904762 // sell
							if( rangema > 0.313779 )
								if( val <= -0.022483 )
									ret := -1.000000 // sell
								if( val > -0.022483 )
									ret := -0.782609 // sell
						if( rangema > 0.4173 )
							if( ma <= 69.3648 )
								if( priceRange <= 1.16215 )
									ret := -0.717647 // sell
								if( priceRange > 1.16215 )
									ret := 0.150000
							if( ma > 69.3648 )
								ret := 0.750000 // buy
					if( val > 0.016111 )
						if( upperBB <= 70.1428 )
							if( priceRange <= 0.454671 )
								if( lowerKC <= 68.5869 )
									ret := -0.692308
								if( lowerKC > 68.5869 )
									ret := 0.055556
							if( priceRange > 0.454671 )
								ret := 0.727273 // buy
						if( upperBB > 70.1428 )
							if( ma <= 69.3693 )
								ret := 0.222222
							if( ma > 69.3693 )
								ret := 1.000000 // buy
			if( ma > 69.5451 )
				if( lowerKC <= 73.8835 )
					if( lowerKC <= 72.464 )
						if( sqzOffInt <= 0.5 )
							if( lowerBB <= 70.5038 )
								if( upperKC <= 71.4748 )
									ret := 0.348442
								if( upperKC > 71.4748 )
									ret := -1.000000 // sell
							if( lowerBB > 70.5038 )
								if( upperKC <= 72.6386 )
									ret := -0.357576
								if( upperKC > 72.6386 )
									ret := 0.195440
						if( sqzOffInt > 0.5 )
							if( dev <= 0.392575 )
								if( ma <= 72.3106 )
									ret := -0.241107
								if( ma > 72.3106 )
									ret := 0.344828
							if( dev > 0.392575 )
								if( basis <= 70.5547 )
									ret := 0.566038
								if( basis > 70.5547 )
									ret := 0.103966
					if( lowerKC > 72.464 )
						if( priceRange <= 0.000901 )
							if( dev <= 0.275712 )
								if( rangema <= 0.160152 )
									ret := -0.400000
								if( rangema > 0.160152 )
									ret := -1.000000 // sell
							if( dev > 0.275712 )
								ret := 0.111111
						if( priceRange > 0.000901 )
							if( ma <= 73.9388 )
								if( priceRange <= 0.259237 )
									ret := 0.414013
								if( priceRange > 0.259237 )
									ret := 0.009901
							if( ma > 73.9388 )
								if( lowerKC <= 73.8488 )
									ret := 0.632153
								if( lowerKC > 73.8488 )
									ret := 0.119048
				if( lowerKC > 73.8835 )
					if( upperBB <= 230.019 )
						if( lowerKC <= 220.865 )
							if( avgHighLow <= 216.536 )
								if( upperKC <= 172.971 )
									ret := 0.017504
								if( upperKC > 172.971 )
									ret := -0.052474
							if( avgHighLow > 216.536 )
								if( lowerBB <= 216.031 )
									ret := -0.776699 // sell
								if( lowerBB > 216.031 )
									ret := -0.073171
						if( lowerKC > 220.865 )
							if( basis <= 228.264 )
								if( dev <= 1.69859 )
									ret := 0.875000 // buy
								if( dev > 1.69859 )
									ret := 1.000000 // buy
							if( basis > 228.264 )
								ret := 0.307692
					if( upperBB > 230.019 )
						if( upperKC <= 231.426 )
							if( rangema <= 1.15613 )
								if( upperBB <= 230.077 )
									ret := -0.941176 // sell
								if( upperBB > 230.077 )
									ret := -1.000000 // sell
							if( rangema > 1.15613 )
								if( rangema <= 1.44494 )
									ret := 0.250000
								if( rangema > 1.44494 )
									ret := -0.885714 // sell
						if( upperKC > 231.426 )
							ret := 0.266667
	if( val > 0.079149 )
		if( avgHighLow <= 134.935 )
			if( rangema <= 1.46179 )
				if( basis <= 133.291 )
					if( upperKC <= 132.63 )
						if( basis <= 123.149 )
							if( upperKC <= 120.745 )
								if( ma <= 52.9272 )
									ret := 0.785714 // buy
								if( ma > 52.9272 )
									ret := -0.133226
							if( upperKC > 120.745 )
								if( ma <= 122.774 )
									ret := 0.138015
								if( ma > 122.774 )
									ret := 0.635294
						if( basis > 123.149 )
							if( dev <= 0.663788 )
								if( dev <= 0.447055 )
									ret := -0.523810
								if( dev > 0.447055 )
									ret := 0.225806
							if( dev > 0.663788 )
								if( avgHighLow <= 125.248 )
									ret := -0.498246
								if( avgHighLow > 125.248 )
									ret := -0.249701
					if( upperKC > 132.63 )
						if( dev <= 0.669959 )
							if( dev <= 0.446413 )
								ret := 1.000000 // buy
							if( dev > 0.446413 )
								if( lowerBB <= 131.553 )
									ret := 0.958333 // buy
								if( lowerBB > 131.553 )
									ret := 0.384615
						if( dev > 0.669959 )
							if( lowerKC <= 130.886 )
								if( lowerKC <= 130.289 )
									ret := -0.250000
								if( lowerKC > 130.289 )
									ret := 0.666667
							if( lowerKC > 130.886 )
								if( ma <= 133.262 )
									ret := -0.205882
								if( ma > 133.262 )
									ret := 0.384615
				if( basis > 133.291 )
					if( rangema <= 0.631444 )
						if( rangema <= 0.415376 )
							if( lowerKC <= 133.276 )
								if( upperBB <= 134.426 )
									ret := -1.000000 // sell
								if( upperBB > 134.426 )
									ret := -0.666667
							if( lowerKC > 133.276 )
								ret := -0.444444
						if( rangema > 0.415376 )
							if( lowerBB <= 132.319 )
								ret := 0.533333
							if( lowerBB > 132.319 )
								if( sqzOnInt <= 0.5 )
									ret := -0.115385
								if( sqzOnInt > 0.5 )
									ret := -0.333333
					if( rangema > 0.631444 )
						if( dev <= 2.66555 )
							if( val <= 0.085092 )
								ret := -0.100000
							if( val > 0.085092 )
								if( dev <= 1.08489 )
									ret := -0.660000
								if( dev > 1.08489 )
									ret := -0.917431 // sell
						if( dev > 2.66555 )
							ret := -0.117647
			if( rangema > 1.46179 )
				if( dev <= 4.16292 )
					if( priceRange <= 0.885479 )
						ret := -1.000000 // sell
					if( priceRange > 0.885479 )
						if( basis <= 134.902 )
							if( ma <= 131.67 )
								ret := -0.357143
							if( ma > 131.67 )
								ret := -0.583333
						if( basis > 134.902 )
							ret := -1.000000 // sell
				if( dev > 4.16292 )
					if( avgHighLow <= 103.625 )
						if( lowerKC <= 95.7422 )
							ret := -0.714286 // sell
						if( lowerKC > 95.7422 )
							ret := -1.000000 // sell
					if( avgHighLow > 103.625 )
						ret := 0.750000 // buy
		if( avgHighLow > 134.935 )
			if( upperKC <= 136.808 )
				if( lowerBB <= 132.981 )
					ret := -0.692308
				if( lowerBB > 132.981 )
					if( upperBB <= 137.692 )
						if( sqzOnInt <= 0.5 )
							if( upperBB <= 136.451 )
								ret := -0.384615
							if( upperBB > 136.451 )
								if( dev <= 1.19562 )
									ret := 0.888889 // buy
								if( dev > 1.19562 )
									ret := 0.050000
						if( sqzOnInt > 0.5 )
							if( upperKC <= 136.251 )
								if( basis <= 135.245 )
									ret := 1.000000 // buy
								if( basis > 135.245 )
									ret := 0.818182 // buy
							if( upperKC > 136.251 )
								ret := 0.454545
					if( upperBB > 137.692 )
						if( val <= 0.161431 )
							ret := 1.000000 // buy
						if( val > 0.161431 )
							ret := 0.818182 // buy
			if( upperKC > 136.808 )
				if( sqzOnInt <= 0.5 )
					if( rangema <= 1.57055 )
						if( rangema <= 1.54395 )
							if( basis <= 214.378 )
								if( lowerKC <= 207.617 )
									ret := -0.022296
								if( lowerKC > 207.617 )
									ret := -0.702128 // sell
							if( basis > 214.378 )
								if( rangema <= 0.910629 )
									ret := 0.111111
								if( rangema > 0.910629 )
									ret := 0.700000 // buy
						if( rangema > 1.54395 )
							ret := -1.000000 // sell
					if( rangema > 1.57055 )
						if( lowerKC <= 148.91 )
							if( basis <= 143.72 )
								if( lowerBB <= 134.085 )
									ret := 0.920000 // buy
								if( lowerBB > 134.085 )
									ret := 1.000000 // buy
							if( basis > 143.72 )
								if( rangema <= 2.0416 )
									ret := -0.750000 // sell
								if( rangema > 2.0416 )
									ret := 1.000000 // buy
						if( lowerKC > 148.91 )
							if( rangema <= 1.67485 )
								if( upperBB <= 166.943 )
									ret := -0.235294
								if( upperBB > 166.943 )
									ret := 0.823529 // buy
							if( rangema > 1.67485 )
								if( val <= 0.20252 )
									ret := -0.710526 // sell
								if( val > 0.20252 )
									ret := 0.018519
				if( sqzOnInt > 0.5 )
					if( lowerKC <= 158.078 )
						if( basis <= 141.941 )
							if( priceRange <= 0.070841 )
								ret := 0.666667
							if( priceRange > 0.070841 )
								if( dev <= 1.45405 )
									ret := -0.246512
								if( dev > 1.45405 )
									ret := -0.914286 // sell
						if( basis > 141.941 )
							if( ma <= 158.281 )
								if( upperKC <= 158.706 )
									ret := 0.090551
								if( upperKC > 158.706 )
									ret := 0.583333
							if( ma > 158.281 )
								if( lowerBB <= 157.548 )
									ret := 1.000000 // buy
								if( lowerBB > 157.548 )
									ret := 0.857143 // buy
					if( lowerKC > 158.078 )
						if( rangema <= 2.07738 )
							if( upperKC <= 183.298 )
								if( lowerKC <= 174.317 )
									ret := -0.323899
								if( lowerKC > 174.317 )
									ret := -0.655172
							if( upperKC > 183.298 )
								if( dev <= 1.02488 )
									ret := -0.206731
								if( dev > 1.02488 )
									ret := 0.251462
						if( rangema > 2.07738 )
							ret := 0.909091 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_QCOM_15Min_8f9d8130(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


