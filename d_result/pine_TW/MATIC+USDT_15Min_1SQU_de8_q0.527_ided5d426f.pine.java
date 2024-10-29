//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MATICUSDT_15Min_1SQU_ed5d426f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1SQU_ed5d426f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_ed5d426f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBB <= 1.21802 )
		if( dev <= 0.022302 )
			if( lowerBB <= 0.400056 )
				if( ma <= 0.402268 )
					if( lowerBB <= 0.396185 )
						if( sqzOnInt <= 0.5 )
							if( val <= -0.000321 )
								if( val <= -0.001029 )
									ret := 0.951220 // buy
								if( val > -0.001029 )
									ret := 0.456376
							if( val > -0.000321 )
								if( val <= 0.000896 )
									ret := -0.056818
								if( val > 0.000896 )
									ret := -0.425373
						if( sqzOnInt > 0.5 )
							if( lowerKC <= 0.354232 )
								if( val <= 0.000511 )
									ret := 0.788079 // buy
								if( val > 0.000511 )
									ret := -0.916667 // sell
							if( lowerKC > 0.354232 )
								if( basis <= 0.361837 )
									ret := -0.900000 // sell
								if( basis > 0.361837 )
									ret := 0.141199
					if( lowerBB > 0.396185 )
						if( dev <= 0.00345 )
							if( lowerBB <= 0.398461 )
								ret := 0.384615
							if( lowerBB > 0.398461 )
								if( basis <= 0.401375 )
									ret := 0.000000
								if( basis > 0.401375 )
									ret := -0.181818
						if( dev > 0.00345 )
							if( dev <= 0.004539 )
								if( lowerKC <= 0.396521 )
									ret := -1.000000 // sell
								if( lowerKC > 0.396521 )
									ret := -0.777778 // sell
							if( dev > 0.004539 )
								ret := -0.230769
				if( ma > 0.402268 )
					if( avgHighLow <= 0.407352 )
						if( sqzOffInt <= 0.5 )
							if( val <= -9.6e-05 )
								ret := 0.266667
							if( val > -9.6e-05 )
								if( ma <= 0.403746 )
									ret := 1.000000 // buy
								if( ma > 0.403746 )
									ret := 0.714286 // buy
						if( sqzOffInt > 0.5 )
							if( lowerBB <= 0.390164 )
								ret := 1.000000 // buy
							if( lowerBB > 0.390164 )
								if( dev <= 0.012893 )
									ret := 0.413223
								if( dev > 0.012893 )
									ret := -0.733333 // sell
					if( avgHighLow > 0.407352 )
						if( dev <= 0.009193 )
							if( val <= 0.000742 )
								ret := -0.692308
							if( val > 0.000742 )
								ret := -1.000000 // sell
						if( dev > 0.009193 )
							if( priceRange <= 0.00295 )
								if( upperKC <= 0.416019 )
									ret := 0.300000
								if( upperKC > 0.416019 )
									ret := 1.000000 // buy
							if( priceRange > 0.00295 )
								ret := -0.520000
			if( lowerBB > 0.400056 )
				if( ma <= 1.23058 )
					if( val <= -0.003017 )
						if( upperKC <= 1.14954 )
							if( priceRange <= 0.0199 )
								if( basis <= 0.93449 )
									ret := 0.815789 // buy
								if( basis > 0.93449 )
									ret := 0.985915 // buy
							if( priceRange > 0.0199 )
								ret := 0.375000
						if( upperKC > 1.14954 )
							ret := -0.812500 // sell
					if( val > -0.003017 )
						if( upperBB <= 0.438061 )
							if( dev <= 0.000955 )
								if( lowerBB <= 0.407745 )
									ret := 0.066667
								if( lowerBB > 0.407745 )
									ret := 0.954545 // buy
							if( dev > 0.000955 )
								if( basis <= 0.421139 )
									ret := -0.051663
								if( basis > 0.421139 )
									ret := -0.341558
						if( upperBB > 0.438061 )
							if( ma <= 0.42622 )
								if( lowerKC <= 0.411832 )
									ret := 0.825000 // buy
								if( lowerKC > 0.411832 )
									ret := 1.000000 // buy
							if( ma > 0.42622 )
								if( basis <= 0.856512 )
									ret := 0.013092
								if( basis > 0.856512 )
									ret := -0.027686
				if( ma > 1.23058 )
					if( sqzOffInt <= 0.5 )
						ret := 1.000000 // buy
					if( sqzOffInt > 0.5 )
						if( avgHighLow <= 1.22632 )
							ret := 1.000000 // buy
						if( avgHighLow > 1.22632 )
							if( val <= 0.000243 )
								ret := 0.285714
							if( val > 0.000243 )
								ret := -0.272727
		if( dev > 0.022302 )
			if( ma <= 0.937005 )
				if( upperKC <= 0.950975 )
					if( lowerBB <= 0.883959 )
						if( val <= 0.003435 )
							if( avgHighLow <= 0.510759 )
								if( upperBB <= 0.515047 )
									ret := -0.071823
								if( upperBB > 0.515047 )
									ret := -0.684211
							if( avgHighLow > 0.510759 )
								if( lowerBB <= 0.506123 )
									ret := 0.745455 // buy
								if( lowerBB > 0.506123 )
									ret := 0.130534
						if( val > 0.003435 )
							if( rangema <= 0.013058 )
								ret := 0.538462
							if( rangema > 0.013058 )
								if( val <= 0.00406 )
									ret := -0.857143 // sell
								if( val > 0.00406 )
									ret := -0.333333
					if( lowerBB > 0.883959 )
						if( upperBB <= 0.946878 )
							if( rangema <= 0.010842 )
								if( avgHighLow <= 0.92005 )
									ret := -0.078947
								if( avgHighLow > 0.92005 )
									ret := -0.718750 // sell
							if( rangema > 0.010842 )
								if( rangema <= 0.011587 )
									ret := -1.000000 // sell
								if( rangema > 0.011587 )
									ret := -0.500000
						if( upperBB > 0.946878 )
							if( priceRange <= 0.00821 )
								if( rangema <= 0.00796 )
									ret := -0.921053 // sell
								if( rangema > 0.00796 )
									ret := -0.692308
							if( priceRange > 0.00821 )
								if( upperBB <= 0.958916 )
									ret := 0.392857
								if( upperBB > 0.958916 )
									ret := -0.777778 // sell
				if( upperKC > 0.950975 )
					if( upperBB <= 0.971215 )
						if( avgHighLow <= 0.936875 )
							if( upperBB <= 0.965844 )
								if( upperKC <= 0.959686 )
									ret := 0.257143
								if( upperKC > 0.959686 )
									ret := -0.612903
							if( upperBB > 0.965844 )
								if( val <= -0.00111 )
									ret := -1.000000 // sell
								if( val > -0.00111 )
									ret := -0.846154 // sell
						if( avgHighLow > 0.936875 )
							if( val <= -0.001187 )
								ret := -0.692308
							if( val > -0.001187 )
								if( dev <= 0.030753 )
									ret := -0.977778 // sell
								if( dev > 0.030753 )
									ret := -0.777778 // sell
					if( upperBB > 0.971215 )
						ret := 0.600000
			if( ma > 0.937005 )
				if( val <= -0.000955 )
					if( ma <= 1.20099 )
						if( sqzOffInt <= 0.5 )
							if( upperBB <= 1.04064 )
								if( basis <= 1.01362 )
									ret := -0.272727
								if( basis > 1.01362 )
									ret := -0.866667 // sell
							if( upperBB > 1.04064 )
								if( ma <= 1.10725 )
									ret := 0.847826 // buy
								if( ma > 1.10725 )
									ret := -0.428571
						if( sqzOffInt > 0.5 )
							if( lowerBB <= 1.12238 )
								if( basis <= 0.98218 )
									ret := 0.715385 // buy
								if( basis > 0.98218 )
									ret := 0.263554
							if( lowerBB > 1.12238 )
								if( avgHighLow <= 1.16922 )
									ret := 0.491803
								if( avgHighLow > 1.16922 )
									ret := 0.873134 // buy
					if( ma > 1.20099 )
						if( priceRange <= 0.010688 )
							if( priceRange <= 0.00695 )
								ret := -0.375000
							if( priceRange > 0.00695 )
								if( upperKC <= 1.23706 )
									ret := 0.214286
								if( upperKC > 1.23706 )
									ret := 0.970588 // buy
						if( priceRange > 0.010688 )
							if( rangema <= 0.011211 )
								if( basis <= 1.20864 )
									ret := -0.375000
								if( basis > 1.20864 )
									ret := 0.500000
							if( rangema > 0.011211 )
								if( basis <= 1.21628 )
									ret := -0.346939
								if( basis > 1.21628 )
									ret := -0.782609 // sell
				if( val > -0.000955 )
					if( lowerKC <= 0.976515 )
						if( rangema <= 0.013199 )
							if( lowerKC <= 0.961773 )
								if( rangema <= 0.011471 )
									ret := 0.870968 // buy
								if( rangema > 0.011471 )
									ret := 0.407407
							if( lowerKC > 0.961773 )
								if( rangema <= 0.011148 )
									ret := -0.215686
								if( rangema > 0.011148 )
									ret := 0.820513 // buy
						if( rangema > 0.013199 )
							if( rangema <= 0.016136 )
								if( avgHighLow <= 0.950642 )
									ret := 0.111111
								if( avgHighLow > 0.950642 )
									ret := -0.723684 // sell
							if( rangema > 0.016136 )
								if( basis <= 1.03349 )
									ret := 0.206897
								if( basis > 1.03349 )
									ret := 1.000000 // buy
					if( lowerKC > 0.976515 )
						if( sqzOnInt <= 0.5 )
							if( lowerBB <= 0.970951 )
								if( val <= -0.000166 )
									ret := 0.384615
								if( val > -0.000166 )
									ret := -0.746835 // sell
							if( lowerBB > 0.970951 )
								if( lowerBB <= 0.990719 )
									ret := 0.666667
								if( lowerBB > 0.990719 )
									ret := 0.022165
						if( sqzOnInt > 0.5 )
							if( upperBB <= 1.1371 )
								if( rangema <= 0.017806 )
									ret := 0.400000
								if( rangema > 0.017806 )
									ret := -0.633333
							if( upperBB > 1.1371 )
								if( lowerKC <= 1.1057 )
									ret := -1.000000 // sell
								if( lowerKC > 1.1057 )
									ret := -0.750000 // sell
	if( lowerBB > 1.21802 )
		if( lowerKC <= 1.26805 )
			if( val <= 0.001097 )
				if( upperKC <= 1.30489 )
					if( lowerBB <= 1.23511 )
						if( avgHighLow <= 1.2374 )
							if( upperBB <= 1.24506 )
								if( rangema <= 0.00728 )
									ret := 0.061856
								if( rangema > 0.00728 )
									ret := -0.342466
							if( upperBB > 1.24506 )
								if( sqzOnInt <= 0.5 )
									ret := -0.471429
								if( sqzOnInt > 0.5 )
									ret := -0.678571
						if( avgHighLow > 1.2374 )
							if( avgHighLow <= 1.24986 )
								if( upperKC <= 1.26507 )
									ret := 0.204082
								if( upperKC > 1.26507 )
									ret := 0.829268 // buy
							if( avgHighLow > 1.24986 )
								if( basis <= 1.25639 )
									ret := -0.507692
								if( basis > 1.25639 )
									ret := 0.550000
					if( lowerBB > 1.23511 )
						if( avgHighLow <= 1.27957 )
							if( sqzOffInt <= 0.5 )
								if( lowerKC <= 1.2588 )
									ret := -0.443649
								if( lowerKC > 1.2588 )
									ret := 0.046154
							if( sqzOffInt > 0.5 )
								if( avgHighLow <= 1.26958 )
									ret := 0.088235
								if( avgHighLow > 1.26958 )
									ret := -0.532258
						if( avgHighLow > 1.27957 )
							if( basis <= 1.27659 )
								if( dev <= 0.018115 )
									ret := 0.833333 // buy
								if( dev > 0.018115 )
									ret := 1.000000 // buy
							if( basis > 1.27659 )
								ret := 0.444444
				if( upperKC > 1.30489 )
					if( ma <= 1.28725 )
						if( dev <= 0.016719 )
							if( val <= -0.000192 )
								ret := -0.750000 // sell
							if( val > -0.000192 )
								ret := -1.000000 // sell
						if( dev > 0.016719 )
							ret := -1.000000 // sell
					if( ma > 1.28725 )
						ret := -0.555556
			if( val > 0.001097 )
				if( basis <= 1.26379 )
					if( dev <= 0.014144 )
						if( lowerBB <= 1.22125 )
							ret := -0.142857
						if( lowerBB > 1.22125 )
							if( val <= 0.001568 )
								if( basis <= 1.2453 )
									ret := -0.981818 // sell
								if( basis > 1.2453 )
									ret := -0.750000 // sell
							if( val > 0.001568 )
								ret := -0.500000
					if( dev > 0.014144 )
						if( lowerBB <= 1.24122 )
							if( dev <= 0.017868 )
								if( rangema <= 0.008121 )
									ret := -0.500000
								if( rangema > 0.008121 )
									ret := -1.000000 // sell
							if( dev > 0.017868 )
								if( avgHighLow <= 1.25027 )
									ret := 0.517241
								if( avgHighLow > 1.25027 )
									ret := -0.714286 // sell
						if( lowerBB > 1.24122 )
							ret := 1.000000 // buy
				if( basis > 1.26379 )
					if( lowerKC <= 1.25536 )
						ret := 0.250000
					if( lowerKC > 1.25536 )
						if( val <= 0.002041 )
							ret := -1.000000 // sell
						if( val > 0.002041 )
							ret := -0.916667 // sell
		if( lowerKC > 1.26805 )
			if( avgHighLow <= 1.29732 )
				if( lowerBB <= 1.27237 )
					if( upperKC <= 1.30267 )
						if( rangema <= 0.007152 )
							if( priceRange <= 0.00705 )
								ret := 0.500000
							if( priceRange > 0.00705 )
								ret := 1.000000 // buy
						if( rangema > 0.007152 )
							if( rangema <= 0.007944 )
								ret := -0.600000
							if( rangema > 0.007944 )
								ret := 0.277778
					if( upperKC > 1.30267 )
						if( basis <= 1.29143 )
							if( priceRange <= 0.013476 )
								ret := 0.875000 // buy
							if( priceRange > 0.013476 )
								ret := 1.000000 // buy
						if( basis > 1.29143 )
							if( lowerKC <= 1.27863 )
								ret := -0.083333
							if( lowerKC > 1.27863 )
								ret := 1.000000 // buy
				if( lowerBB > 1.27237 )
					if( ma <= 1.30029 )
						if( lowerBB <= 1.2741 )
							ret := -1.000000 // sell
						if( lowerBB > 1.2741 )
							if( val <= -0.000935 )
								ret := 0.454545
							if( val > -0.000935 )
								if( lowerKC <= 1.2721 )
									ret := 0.000000
								if( lowerKC > 1.2721 )
									ret := -0.916667 // sell
					if( ma > 1.30029 )
						ret := 1.000000 // buy
			if( avgHighLow > 1.29732 )
				if( val <= 0.000775 )
					if( basis <= 1.34441 )
						if( upperKC <= 1.34562 )
							if( rangema <= 0.010053 )
								if( val <= -0.00074 )
									ret := -1.000000 // sell
								if( val > -0.00074 )
									ret := -0.818182 // sell
							if( rangema > 0.010053 )
								if( basis <= 1.31866 )
									ret := -0.488889
								if( basis > 1.31866 )
									ret := 0.897436 // buy
						if( upperKC > 1.34562 )
							if( lowerKC <= 1.32821 )
								if( rangema <= 0.011524 )
									ret := -0.833333 // sell
								if( rangema > 0.011524 )
									ret := -0.966667 // sell
							if( lowerKC > 1.32821 )
								if( avgHighLow <= 1.33808 )
									ret := -1.000000 // sell
								if( avgHighLow > 1.33808 )
									ret := -0.062500
					if( basis > 1.34441 )
						if( basis <= 1.38592 )
							if( basis <= 1.37475 )
								if( upperKC <= 1.37378 )
									ret := 0.483051
								if( upperKC > 1.37378 )
									ret := -0.288136
							if( basis > 1.37475 )
								if( avgHighLow <= 1.37778 )
									ret := 0.960784 // buy
								if( avgHighLow > 1.37778 )
									ret := -0.272727
						if( basis > 1.38592 )
							if( val <= -0.000827 )
								if( lowerKC <= 1.39 )
									ret := 0.666667
								if( lowerKC > 1.39 )
									ret := -0.447761
							if( val > -0.000827 )
								if( priceRange <= 0.006398 )
									ret := -0.457944
								if( priceRange > 0.006398 )
									ret := 0.229965
				if( val > 0.000775 )
					if( sqzOnInt <= 0.5 )
						if( ma <= 1.47585 )
							if( lowerBB <= 1.4038 )
								if( avgHighLow <= 1.39348 )
									ret := -0.013514
								if( avgHighLow > 1.39348 )
									ret := -0.780488 // sell
							if( lowerBB > 1.4038 )
								if( avgHighLow <= 1.42972 )
									ret := 1.000000 // buy
								if( avgHighLow > 1.42972 )
									ret := 0.466667
						if( ma > 1.47585 )
							if( lowerBB <= 1.47108 )
								if( val <= 0.001427 )
									ret := -1.000000 // sell
								if( val > 0.001427 )
									ret := -0.818182 // sell
							if( lowerBB > 1.47108 )
								if( dev <= 0.016011 )
									ret := 0.000000
								if( dev > 0.016011 )
									ret := -0.857143 // sell
					if( sqzOnInt > 0.5 )
						if( ma <= 1.46816 )
							if( dev <= 0.008964 )
								ret := -0.545455
							if( dev > 0.008964 )
								if( upperKC <= 1.39229 )
									ret := -0.666667
								if( upperKC > 1.39229 )
									ret := -0.976190 // sell
						if( ma > 1.46816 )
							if( avgHighLow <= 1.4841 )
								if( val <= 0.001189 )
									ret := -0.400000
								if( val > 0.001189 )
									ret := -0.900000 // sell
							if( avgHighLow > 1.4841 )
								if( lowerBB <= 1.48682 )
									ret := 0.000000
								if( lowerBB > 1.48682 )
									ret := 0.125000
	
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
float op_operation = decision_tree_0_MATICUSDT_15Min_ed5d426f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


