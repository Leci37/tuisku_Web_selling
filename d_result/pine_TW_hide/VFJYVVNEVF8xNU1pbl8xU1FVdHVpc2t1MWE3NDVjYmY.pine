//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: TRXUSDT_15Min_1SQU_1a745cbf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1SQU_1a745cbf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_1a745cbf(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBB <= 0.066041 )
		if( lowerBB <= 0.048638 )
			if( lowerKC <= 0.046081 )
				ret := -1.000000 // sell
			if( lowerKC > 0.046081 )
				if( ma <= 0.049639 )
					if( avgHighLow <= 0.049383 )
						if( upperKC <= 0.049593 )
							if( priceRange <= 0.002257 )
								if( lowerBB <= 0.048569 )
									ret := 1.000000 // buy
								if( lowerBB > 0.048569 )
									ret := 0.916667 // buy
							if( priceRange > 0.002257 )
								ret := 0.000000
						if( upperKC > 0.049593 )
							if( rangema <= 0.000977 )
								if( priceRange <= 0.000668 )
									ret := 0.714286 // buy
								if( priceRange > 0.000668 )
									ret := -0.500000
							if( rangema > 0.000977 )
								ret := -1.000000 // sell
					if( avgHighLow > 0.049383 )
						if( lowerKC <= 0.048639 )
							ret := -0.714286 // sell
						if( lowerKC > 0.048639 )
							ret := -1.000000 // sell
				if( ma > 0.049639 )
					if( avgHighLow <= 0.049966 )
						ret := 0.000000
					if( avgHighLow > 0.049966 )
						if( lowerBB <= 0.047982 )
							if( basis <= 0.05102 )
								if( ma <= 0.050657 )
									ret := 0.750000 // buy
								if( ma > 0.050657 )
									ret := 0.750000 // buy
							if( basis > 0.05102 )
								ret := 1.000000 // buy
						if( lowerBB > 0.047982 )
							ret := 1.000000 // buy
		if( lowerBB > 0.048638 )
			if( upperBB <= 0.050967 )
				if( lowerBB <= 0.049914 )
					if( lowerKC <= 0.049553 )
						if( sqzOffInt <= 0.5 )
							if( dev <= 0.000579 )
								if( val <= 3.3e-05 )
									ret := 0.866667 // buy
								if( val > 3.3e-05 )
									ret := 0.352941
							if( dev > 0.000579 )
								ret := -0.600000
						if( sqzOffInt > 0.5 )
							if( ma <= 0.049591 )
								if( avgHighLow <= 0.049718 )
									ret := 0.000000
								if( avgHighLow > 0.049718 )
									ret := 0.833333 // buy
							if( ma > 0.049591 )
								if( lowerKC <= 0.049273 )
									ret := -0.785714 // sell
								if( lowerKC > 0.049273 )
									ret := -0.133333
					if( lowerKC > 0.049553 )
						if( lowerBB <= 0.049777 )
							if( rangema <= 0.000185 )
								if( dev <= 0.000306 )
									ret := 0.800000 // buy
								if( dev > 0.000306 )
									ret := -0.250000
							if( rangema > 0.000185 )
								if( priceRange <= 0.000195 )
									ret := -0.886364 // sell
								if( priceRange > 0.000195 )
									ret := -0.437500
						if( lowerBB > 0.049777 )
							if( lowerKC <= 0.049755 )
								if( ma <= 0.050107 )
									ret := -0.600000
								if( ma > 0.050107 )
									ret := -0.928571 // sell
							if( lowerKC > 0.049755 )
								if( basis <= 0.050348 )
									ret := 0.671642
								if( basis > 0.050348 )
									ret := -0.571429
				if( lowerBB > 0.049914 )
					if( priceRange <= 8.7e-05 )
						if( dev <= 0.000194 )
							ret := 0.142857
						if( dev > 0.000194 )
							if( avgHighLow <= 0.050688 )
								ret := -0.857143 // sell
							if( avgHighLow > 0.050688 )
								ret := -0.400000
					if( priceRange > 8.7e-05 )
						if( rangema <= 0.000324 )
							if( ma <= 0.050668 )
								if( dev <= 0.000385 )
									ret := 0.756098 // buy
								if( dev > 0.000385 )
									ret := -0.166667
							if( ma > 0.050668 )
								if( lowerKC <= 0.050526 )
									ret := -0.028571
								if( lowerKC > 0.050526 )
									ret := 0.812500 // buy
						if( rangema > 0.000324 )
							if( val <= 1e-06 )
								if( priceRange <= 0.000345 )
									ret := 0.000000
								if( priceRange > 0.000345 )
									ret := -1.000000 // sell
							if( val > 1e-06 )
								ret := 1.000000 // buy
			if( upperBB > 0.050967 )
				if( lowerKC <= 0.050237 )
					if( ma <= 0.050794 )
						if( upperKC <= 0.051267 )
							if( val <= -7.9e-05 )
								ret := 0.833333 // buy
							if( val > -7.9e-05 )
								if( sqzOffInt <= 0.5 )
									ret := 0.250000
								if( sqzOffInt > 0.5 )
									ret := -0.609756
						if( upperKC > 0.051267 )
							if( upperBB <= 0.051073 )
								if( dev <= 0.000389 )
									ret := -0.875000 // sell
								if( dev > 0.000389 )
									ret := 0.400000
							if( upperBB > 0.051073 )
								if( basis <= 0.050743 )
									ret := -0.978723 // sell
								if( basis > 0.050743 )
									ret := -0.500000
					if( ma > 0.050794 )
						ret := 0.800000 // buy
				if( lowerKC > 0.050237 )
					if( rangema <= 0.000196 )
						if( upperKC <= 0.05239 )
							if( rangema <= 0.000163 )
								if( upperBB <= 0.052402 )
									ret := -0.502392
								if( upperBB > 0.052402 )
									ret := 1.000000 // buy
							if( rangema > 0.000163 )
								if( priceRange <= 0.000138 )
									ret := 0.452055
								if( priceRange > 0.000138 )
									ret := -0.068702
						if( upperKC > 0.05239 )
							if( avgHighLow <= 0.053129 )
								if( upperKC <= 0.053219 )
									ret := 0.310705
								if( upperKC > 0.053219 )
									ret := 0.680723
							if( avgHighLow > 0.053129 )
								if( avgHighLow <= 0.06633 )
									ret := 0.049077
								if( avgHighLow > 0.06633 )
									ret := -0.826087 // sell
					if( rangema > 0.000196 )
						if( rangema <= 0.000435 )
							if( upperBB <= 0.066951 )
								if( upperKC <= 0.066652 )
									ret := 0.148625
								if( upperKC > 0.066652 )
									ret := -0.331325
							if( upperBB > 0.066951 )
								if( basis <= 0.066841 )
									ret := 0.548780
								if( basis > 0.066841 )
									ret := -0.181818
						if( rangema > 0.000435 )
							if( lowerKC <= 0.066332 )
								if( lowerBB <= 0.051454 )
									ret := -0.608108
								if( lowerBB > 0.051454 )
									ret := 0.016329
							if( lowerKC > 0.066332 )
								if( val <= 0.000201 )
									ret := 0.747253 // buy
								if( val > 0.000201 )
									ret := -0.666667
	if( lowerBB > 0.066041 )
		if( dev <= 0.001263 )
			if( ma <= 0.066374 )
				if( basis <= 0.06631 )
					if( priceRange <= 9.9e-05 )
						if( upperBB <= 0.066348 )
							if( avgHighLow <= 0.066199 )
								if( lowerBB <= 0.066057 )
									ret := 0.250000
								if( lowerBB > 0.066057 )
									ret := 0.000000
							if( avgHighLow > 0.066199 )
								if( val <= -8e-06 )
									ret := 0.000000
								if( val > -8e-06 )
									ret := 0.750000 // buy
						if( upperBB > 0.066348 )
							if( lowerKC <= 0.066139 )
								if( val <= 5e-06 )
									ret := 0.727273 // buy
								if( val > 5e-06 )
									ret := 0.000000
							if( lowerKC > 0.066139 )
								ret := -0.250000
					if( priceRange > 9.9e-05 )
						if( priceRange <= 0.00029 )
							if( upperKC <= 0.066517 )
								if( basis <= 0.066227 )
									ret := -0.148148
								if( basis > 0.066227 )
									ret := -0.690476
							if( upperKC > 0.066517 )
								if( lowerBB <= 0.066058 )
									ret := 0.666667
								if( lowerBB > 0.066058 )
									ret := -0.238095
						if( priceRange > 0.00029 )
							if( dev <= 0.000172 )
								ret := 0.750000 // buy
							if( dev > 0.000172 )
								ret := 1.000000 // buy
				if( basis > 0.06631 )
					if( val <= -2e-05 )
						if( rangema <= 0.000114 )
							ret := -0.400000
						if( rangema > 0.000114 )
							if( upperBB <= 0.066538 )
								if( lowerKC <= 0.066139 )
									ret := 0.750000 // buy
								if( lowerKC > 0.066139 )
									ret := 1.000000 // buy
							if( upperBB > 0.066538 )
								ret := 0.000000
					if( val > -2e-05 )
						if( avgHighLow <= 0.066438 )
							if( avgHighLow <= 0.066332 )
								if( lowerKC <= 0.066094 )
									ret := -0.743590 // sell
								if( lowerKC > 0.066094 )
									ret := -0.362319
							if( avgHighLow > 0.066332 )
								if( lowerBB <= 0.066105 )
									ret := -0.250000
								if( lowerBB > 0.066105 )
									ret := -0.883721 // sell
						if( avgHighLow > 0.066438 )
							ret := 0.500000
			if( ma > 0.066374 )
				if( dev <= 0.000424 )
					if( lowerBB <= 0.1084 )
						if( ma <= 0.089583 )
							if( lowerBB <= 0.08892 )
								if( val <= 6.6e-05 )
									ret := 0.010713
								if( val > 6.6e-05 )
									ret := 0.430380
							if( lowerBB > 0.08892 )
								if( rangema <= 0.000121 )
									ret := -0.920000 // sell
								if( rangema > 0.000121 )
									ret := -0.408333
						if( ma > 0.089583 )
							if( upperKC <= 0.108962 )
								if( ma <= 0.10348 )
									ret := 0.167218
								if( ma > 0.10348 )
									ret := 0.050879
							if( upperKC > 0.108962 )
								if( upperBB <= 0.109063 )
									ret := 1.000000 // buy
								if( upperBB > 0.109063 )
									ret := 0.736842 // buy
					if( lowerBB > 0.1084 )
						if( upperKC <= 0.10977 )
							if( lowerBB <= 0.109114 )
								if( lowerBB <= 0.1088 )
									ret := -0.055556
								if( lowerBB > 0.1088 )
									ret := -0.613793
							if( lowerBB > 0.109114 )
								if( val <= 3e-06 )
									ret := 0.666667
								if( val > 3e-06 )
									ret := -0.200000
						if( upperKC > 0.10977 )
							if( upperKC <= 0.156767 )
								if( rangema <= 0.000357 )
									ret := -0.012311
								if( rangema > 0.000357 )
									ret := 0.163462
							if( upperKC > 0.156767 )
								if( ma <= 0.164953 )
									ret := -0.169448
								if( ma > 0.164953 )
									ret := 0.909091 // buy
				if( dev > 0.000424 )
					if( lowerKC <= 0.068026 )
						if( lowerKC <= 0.067047 )
							if( upperKC <= 0.067883 )
								if( lowerBB <= 0.066817 )
									ret := 0.152019
								if( lowerBB > 0.066817 )
									ret := -0.566667
							if( upperKC > 0.067883 )
								if( lowerKC <= 0.067022 )
									ret := -0.786517 // sell
								if( lowerKC > 0.067022 )
									ret := 0.000000
						if( lowerKC > 0.067047 )
							if( avgHighLow <= 0.067903 )
								if( upperKC <= 0.068128 )
									ret := 0.578125
								if( upperKC > 0.068128 )
									ret := -0.287582
							if( avgHighLow > 0.067903 )
								if( val <= 2e-05 )
									ret := 0.621103
								if( val > 2e-05 )
									ret := 0.189655
					if( lowerKC > 0.068026 )
						if( upperKC <= 0.069192 )
							if( priceRange <= 8.4e-05 )
								if( lowerKC <= 0.068178 )
									ret := 1.000000 // buy
								if( lowerKC > 0.068178 )
									ret := 0.750000 // buy
							if( priceRange > 8.4e-05 )
								if( lowerBB <= 0.067926 )
									ret := 0.097561
								if( lowerBB > 0.067926 )
									ret := -0.722222 // sell
						if( upperKC > 0.069192 )
							if( upperBB <= 0.069781 )
								if( lowerKC <= 0.068342 )
									ret := -0.072464
								if( lowerKC > 0.068342 )
									ret := 0.468227
							if( upperBB > 0.069781 )
								if( upperBB <= 0.071217 )
									ret := -0.066468
								if( upperBB > 0.071217 )
									ret := 0.083277
		if( dev > 0.001263 )
			if( basis <= 0.104308 )
				if( basis <= 0.084929 )
					if( upperKC <= 0.073775 )
						if( upperBB <= 0.072834 )
							if( lowerBB <= 0.0684 )
								if( dev <= 0.002251 )
									ret := -0.454545
								if( dev > 0.002251 )
									ret := 0.631579
							if( lowerBB > 0.0684 )
								if( upperKC <= 0.0716 )
									ret := 0.660714
								if( upperKC > 0.0716 )
									ret := -0.024390
						if( upperBB > 0.072834 )
							if( lowerKC <= 0.071167 )
								if( val <= 0.000185 )
									ret := -0.834254 // sell
								if( val > 0.000185 )
									ret := 1.000000 // buy
							if( lowerKC > 0.071167 )
								if( avgHighLow <= 0.071987 )
									ret := 0.823529 // buy
								if( avgHighLow > 0.071987 )
									ret := -0.605263
					if( upperKC > 0.073775 )
						if( avgHighLow <= 0.073502 )
							if( upperBB <= 0.074183 )
								if( priceRange <= 0.000736 )
									ret := 0.000000
								if( priceRange > 0.000736 )
									ret := -0.857143 // sell
							if( upperBB > 0.074183 )
								if( upperKC <= 0.076486 )
									ret := 0.727273 // buy
								if( upperKC > 0.076486 )
									ret := -1.000000 // sell
						if( avgHighLow > 0.073502 )
							if( priceRange <= 0.002245 )
								if( dev <= 0.00296 )
									ret := -0.111448
								if( dev > 0.00296 )
									ret := 0.165541
							if( priceRange > 0.002245 )
								if( upperKC <= 0.079895 )
									ret := -0.789474 // sell
								if( upperKC > 0.079895 )
									ret := -0.409091
				if( basis > 0.084929 )
					if( rangema <= 0.001905 )
						if( lowerKC <= 0.084354 )
							if( priceRange <= 0.003387 )
								if( avgHighLow <= 0.084895 )
									ret := -0.333333
								if( avgHighLow > 0.084895 )
									ret := -0.888889 // sell
							if( priceRange > 0.003387 )
								ret := 0.000000
						if( lowerKC > 0.084354 )
							if( avgHighLow <= 0.087697 )
								if( avgHighLow <= 0.08736 )
									ret := -0.184211
								if( avgHighLow > 0.08736 )
									ret := 0.809524 // buy
							if( avgHighLow > 0.087697 )
								if( lowerKC <= 0.102758 )
									ret := -0.730233 // sell
								if( lowerKC > 0.102758 )
									ret := -0.066667
					if( rangema > 0.001905 )
						if( sqzOffInt <= 0.5 )
							ret := 0.500000
						if( sqzOffInt > 0.5 )
							ret := 1.000000 // buy
			if( basis > 0.104308 )
				if( dev <= 0.001797 )
					if( lowerKC <= 0.108008 )
						if( avgHighLow <= 0.107489 )
							if( val <= -6.1e-05 )
								if( avgHighLow <= 0.104922 )
									ret := -0.750000 // sell
								if( avgHighLow > 0.104922 )
									ret := 1.000000 // buy
							if( val > -6.1e-05 )
								if( dev <= 0.001358 )
									ret := 0.000000
								if( dev > 0.001358 )
									ret := -0.909091 // sell
						if( avgHighLow > 0.107489 )
							if( lowerKC <= 0.10692 )
								ret := 0.000000
							if( lowerKC > 0.10692 )
								if( val <= -9.1e-05 )
									ret := 0.000000
								if( val > -9.1e-05 )
									ret := 0.844444 // buy
					if( lowerKC > 0.108008 )
						if( basis <= 0.127557 )
							if( ma <= 0.11999 )
								if( avgHighLow <= 0.118467 )
									ret := -0.349091
								if( avgHighLow > 0.118467 )
									ret := 0.529412
							if( ma > 0.11999 )
								if( priceRange <= 0.000177 )
									ret := 0.647059
								if( priceRange > 0.000177 )
									ret := -0.594286
						if( basis > 0.127557 )
							if( avgHighLow <= 0.152036 )
								if( rangema <= 0.000511 )
									ret := 0.078947
								if( rangema > 0.000511 )
									ret := 0.662791
							if( avgHighLow > 0.152036 )
								if( rangema <= 0.00069 )
									ret := 0.084746
								if( rangema > 0.00069 )
									ret := -0.392593
				if( dev > 0.001797 )
					if( lowerKC <= 0.116847 )
						if( rangema <= 0.000937 )
							if( val <= -2.3e-05 )
								if( ma <= 0.111833 )
									ret := 0.651163
								if( ma > 0.111833 )
									ret := 0.090909
							if( val > -2.3e-05 )
								if( avgHighLow <= 0.110447 )
									ret := -0.571429
								if( avgHighLow > 0.110447 )
									ret := 0.190476
						if( rangema > 0.000937 )
							if( priceRange <= 0.00058 )
								if( rangema <= 0.001178 )
									ret := -0.714286 // sell
								if( rangema > 0.001178 )
									ret := 0.846154 // buy
							if( priceRange > 0.00058 )
								if( val <= 0.000285 )
									ret := 0.896552 // buy
								if( val > 0.000285 )
									ret := 0.000000
					if( lowerKC > 0.116847 )
						if( lowerBB <= 0.148149 )
							if( val <= 0.000214 )
								if( val <= 0.00012 )
									ret := -0.048583
								if( val > 0.00012 )
									ret := -0.740741 // sell
							if( val > 0.000214 )
								if( ma <= 0.123173 )
									ret := 0.750000 // buy
								if( ma > 0.123173 )
									ret := 1.000000 // buy
						if( lowerBB > 0.148149 )
							if( avgHighLow <= 0.157707 )
								if( upperBB <= 0.154844 )
									ret := 0.961039 // buy
								if( upperBB > 0.154844 )
									ret := 0.513514
							if( avgHighLow > 0.157707 )
								if( avgHighLow <= 0.159108 )
									ret := -0.680000
								if( avgHighLow > 0.159108 )
									ret := 0.100000
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_1a745cbf(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


