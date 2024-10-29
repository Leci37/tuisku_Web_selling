//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: QCOM_1Min_1KON_d5ef7073 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1KON_d5ef7073", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_d5ef7073(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -19.0366 )
		if( xrsi <= 56.3376 )
			if( nvim <= 0.009654 )
				if( oscp <= -61.6822 )
					if( oscp <= -125.991 )
						ret := -0.545455
					if( oscp > -125.991 )
						if( pvimin <= 0.086669 )
							if( xrsi <= 45.1126 )
								if( verde_mean <= -36.1698 )
									ret := 0.250000
								if( verde_mean > -36.1698 )
									ret := 0.975610 // buy
							if( xrsi > 45.1126 )
								ret := 0.250000
						if( pvimin > 0.086669 )
							if( pvi_ema <= 0.096403 )
								ret := -0.750000 // sell
							if( pvi_ema > 0.096403 )
								if( marron <= 13.9867 )
									ret := 0.100000
								if( marron > 13.9867 )
									ret := 0.484848
				if( oscp > -61.6822 )
					if( media <= 0.359407 )
						if( stoc <= 6.80113 )
							ret := 0.428571
						if( stoc > 6.80113 )
							ret := 0.866667 // buy
					if( media > 0.359407 )
						if( azul_mean <= 14.7923 )
							if( nvi <= -0.031656 )
								if( verde <= -35.4047 )
									ret := -0.333333
								if( verde > -35.4047 )
									ret := 0.222222
							if( nvi > -0.031656 )
								if( media_azul <= 68.7802 )
									ret := -0.194715
								if( media_azul > 68.7802 )
									ret := -0.636364
						if( azul_mean > 14.7923 )
							if( pvi_ema <= -0.009205 )
								ret := 1.000000 // buy
							if( pvi_ema > -0.009205 )
								if( marron_mean <= 9.0316 )
									ret := 0.730769 // buy
								if( marron_mean > 9.0316 )
									ret := 0.095563
			if( nvim > 0.009654 )
				if( pvi <= 0.20794 )
					if( verde_azul <= -180.261 )
						if( media_azul <= -59.0138 )
							ret := -0.450000
						if( media_azul > -59.0138 )
							ret := -1.000000 // sell
					if( verde_azul > -180.261 )
						if( verde_media <= -40.255 )
							if( azul <= 34.7208 )
								if( source <= 162.025 )
									ret := -0.115942
								if( source > 162.025 )
									ret := 0.104463
							if( azul > 34.7208 )
								if( pvimin <= -0.175018 )
									ret := -0.128440
								if( pvimin > -0.175018 )
									ret := 0.394799
						if( verde_media > -40.255 )
							if( nvi_ema <= 0.060023 )
								if( BollOsc <= -3.08556 )
									ret := 0.324074
								if( BollOsc > -3.08556 )
									ret := 0.630682
							if( nvi_ema > 0.060023 )
								if( azul_mean <= 56.7911 )
									ret := 0.177995
								if( azul_mean > 56.7911 )
									ret := -0.404255
				if( pvi > 0.20794 )
					if( pvimin <= 0.250789 )
						if( xmf <= 25.4179 )
							if( nvimax <= 0.087106 )
								if( verde_media <= -86.5186 )
									ret := -0.454545
								if( verde_media > -86.5186 )
									ret := 0.287234
							if( nvimax > 0.087106 )
								if( BollOsc <= -55.2453 )
									ret := -0.944444 // sell
								if( BollOsc > -55.2453 )
									ret := -0.272727
						if( xmf > 25.4179 )
							if( oscp <= -61.4171 )
								ret := 0.200000
							if( oscp > -61.4171 )
								if( pvimax <= 0.240712 )
									ret := -0.376068
								if( pvimax > 0.240712 )
									ret := -0.860465 // sell
					if( pvimin > 0.250789 )
						if( pvi <= 0.249999 )
							ret := 1.000000 // buy
						if( pvi > 0.249999 )
							ret := -0.238095
		if( xrsi > 56.3376 )
			if( tprice <= 163.923 )
				if( oscp <= -24.7082 )
					ret := 1.000000 // buy
				if( oscp > -24.7082 )
					ret := -0.157895
			if( tprice > 163.923 )
				if( azul <= 48.7639 )
					if( nvim <= 0.234745 )
						if( media <= 88.0968 )
							if( stoc <= 69.2383 )
								if( marron_mean <= 52.9728 )
									ret := 0.900000 // buy
								if( marron_mean > 52.9728 )
									ret := 0.071429
							if( stoc > 69.2383 )
								if( xrsi <= 59.5061 )
									ret := -0.648148
								if( xrsi > 59.5061 )
									ret := 0.147059
						if( media > 88.0968 )
							if( source <= 172.035 )
								if( pvimin <= -0.125377 )
									ret := 0.000000
								if( pvimin > -0.125377 )
									ret := 0.870968 // buy
							if( source > 172.035 )
								if( verde_media <= -23.0045 )
									ret := -0.122449
								if( verde_media > -23.0045 )
									ret := 0.750000 // buy
					if( nvim > 0.234745 )
						if( tprice <= 166.85 )
							if( nvi_ema <= 0.251297 )
								ret := -0.700000 // sell
							if( nvi_ema > 0.251297 )
								ret := -0.818182 // sell
						if( tprice > 166.85 )
							if( nvimax <= 0.310013 )
								ret := 0.000000
							if( nvimax > 0.310013 )
								ret := -0.600000
				if( azul > 48.7639 )
					if( pvi <= 0.189338 )
						if( nvim <= 0.045344 )
							if( azul_mean <= 77.0642 )
								if( verde_media <= -31.4904 )
									ret := 0.428571
								if( verde_media > -31.4904 )
									ret := -0.166667
							if( azul_mean > 77.0642 )
								if( marron <= 91.0861 )
									ret := -1.000000 // sell
								if( marron > 91.0861 )
									ret := -0.900000 // sell
						if( nvim > 0.045344 )
							if( stoc <= 54.2726 )
								ret := -1.000000 // sell
							if( stoc > 54.2726 )
								if( stoc <= 67.6775 )
									ret := -0.533333
								if( stoc > 67.6775 )
									ret := -0.855072 // sell
					if( pvi > 0.189338 )
						if( verde_azul <= -53.3536 )
							ret := 0.916667 // buy
						if( verde_azul > -53.3536 )
							ret := -0.333333
	if( oscp > -19.0366 )
		if( pvimax <= 0.197566 )
			if( nvimax <= 0.049112 )
				if( marron_mean <= 38.1977 )
					if( pvimin <= 0.087225 )
						if( azul_mean <= -20.6444 )
							if( xmf <= 16.5683 )
								if( verde_media <= -28.0024 )
									ret := 0.960000 // buy
								if( verde_media > -28.0024 )
									ret := 0.655172
							if( xmf > 16.5683 )
								if( nvi <= -0.024629 )
									ret := -0.084615
								if( nvi > -0.024629 )
									ret := 0.450000
						if( azul_mean > -20.6444 )
							if( xmf <= 17.3322 )
								if( pvi_ema <= 0.047873 )
									ret := 0.759494 // buy
								if( pvi_ema > 0.047873 )
									ret := -0.125000
							if( xmf > 17.3322 )
								if( azul_mean <= -7.32042 )
									ret := -0.250000
								if( azul_mean > -7.32042 )
									ret := 0.088042
					if( pvimin > 0.087225 )
						if( verde_mean <= 34.7717 )
							if( marron_mean <= 0.167512 )
								if( oscp <= -16.7653 )
									ret := 0.595238
								if( oscp > -16.7653 )
									ret := 0.006410
							if( marron_mean > 0.167512 )
								if( media <= 16.3594 )
									ret := 0.102981
								if( media > 16.3594 )
									ret := -0.183834
						if( verde_mean > 34.7717 )
							if( azul <= -14.2148 )
								if( pvimin <= 0.160897 )
									ret := 0.734043 // buy
								if( pvimin > 0.160897 )
									ret := 0.000000
							if( azul > -14.2148 )
								if( source <= 201.1 )
									ret := -0.375000
								if( source > 201.1 )
									ret := 0.627907
				if( marron_mean > 38.1977 )
					if( pvimax <= 0.163329 )
						if( media <= 75.0994 )
							if( azul <= -18.2807 )
								if( marron <= 100.578 )
									ret := 0.362022
								if( marron > 100.578 )
									ret := -0.812500 // sell
							if( azul > -18.2807 )
								if( oscp <= 46.0882 )
									ret := 0.091567
								if( oscp > 46.0882 )
									ret := -0.484848
						if( media > 75.0994 )
							if( tprice <= 179.653 )
								if( source <= 173.26 )
									ret := -0.062073
								if( source > 173.26 )
									ret := 0.373464
							if( tprice > 179.653 )
								if( verde <= 195.012 )
									ret := -0.120664
								if( verde > 195.012 )
									ret := -0.958333 // sell
					if( pvimax > 0.163329 )
						if( source <= 203.931 )
							if( xrsi <= 77.4208 )
								if( nvimin <= 0.029714 )
									ret := 0.084418
								if( nvimin > 0.029714 )
									ret := 0.330435
							if( xrsi > 77.4208 )
								if( oscp <= 17.5628 )
									ret := 0.702020 // buy
								if( oscp > 17.5628 )
									ret := 0.131980
						if( source > 203.931 )
							if( stoc <= 83.8497 )
								if( xmf <= 31.8844 )
									ret := -0.545455
								if( xmf > 31.8844 )
									ret := -0.036342
							if( stoc > 83.8497 )
								if( media_azul <= 42.589 )
									ret := -0.434783
								if( media_azul > 42.589 )
									ret := 0.309677
			if( nvimax > 0.049112 )
				if( media_azul <= -32.2438 )
					if( media <= 79.3147 )
						if( azul <= 133.053 )
							if( verde_media <= 3.14562 )
								ret := 0.083333
							if( verde_media > 3.14562 )
								if( stoc <= 64.6834 )
									ret := -0.909091 // sell
								if( stoc > 64.6834 )
									ret := -0.150000
						if( azul > 133.053 )
							ret := -1.000000 // sell
					if( media > 79.3147 )
						ret := 0.400000
				if( media_azul > -32.2438 )
					if( nvimax <= 0.223224 )
						if( tprice <= 162.034 )
							if( nvim <= 0.154974 )
								if( stoc <= 50.8808 )
									ret := 0.009868
								if( stoc > 50.8808 )
									ret := 0.281307
							if( nvim > 0.154974 )
								if( marron <= 13.9182 )
									ret := 0.385417
								if( marron > 13.9182 )
									ret := -0.051758
						if( tprice > 162.034 )
							if( verde_azul <= 213.324 )
								if( nvi_ema <= 0.033257 )
									ret := -0.600000
								if( nvi_ema > 0.033257 )
									ret := -0.055177
							if( verde_azul > 213.324 )
								if( verde_mean <= 185.325 )
									ret := -0.507042
								if( verde_mean > 185.325 )
									ret := 0.236842
					if( nvimax > 0.223224 )
						if( source <= 167.45 )
							if( oscp <= 14.6799 )
								if( marron_mean <= 106.759 )
									ret := 0.138920
								if( marron_mean > 106.759 )
									ret := -0.305195
							if( oscp > 14.6799 )
								if( oscp <= 79.2569 )
									ret := -0.074823
								if( oscp > 79.2569 )
									ret := 0.604651
						if( source > 167.45 )
							if( media <= 20.8749 )
								if( marron <= 18.6187 )
									ret := 0.487437
								if( marron > 18.6187 )
									ret := 0.006024
							if( media > 20.8749 )
								if( verde_media <= 94.1102 )
									ret := -0.039689
								if( verde_media > 94.1102 )
									ret := 0.402597
		if( pvimax > 0.197566 )
			if( nvim <= 0.09081 )
				if( oscp <= -5.79655 )
					if( nvi_ema <= 0.033144 )
						if( media <= -7.89485 )
							ret := 1.000000 // buy
						if( media > -7.89485 )
							if( verde_azul <= -23.8991 )
								if( pvim <= 0.195416 )
									ret := 0.703704 // buy
								if( pvim > 0.195416 )
									ret := -0.363636
							if( verde_azul > -23.8991 )
								if( source <= 207.001 )
									ret := -0.475845
								if( source > 207.001 )
									ret := 0.036697
					if( nvi_ema > 0.033144 )
						if( nvi_ema <= 0.069152 )
							if( verde <= 35.5548 )
								if( verde <= 29.9602 )
									ret := 0.030426
								if( verde > 29.9602 )
									ret := 0.575000
							if( verde > 35.5548 )
								if( verde_azul <= 15.9926 )
									ret := 0.480000
								if( verde_azul > 15.9926 )
									ret := -0.254098
						if( nvi_ema > 0.069152 )
							if( tprice <= 213.839 )
								if( xrsi <= 40.1566 )
									ret := 0.315789
								if( xrsi > 40.1566 )
									ret := -0.352941
							if( tprice > 213.839 )
								if( pvi_ema <= 0.239712 )
									ret := -0.783784 // sell
								if( pvi_ema > 0.239712 )
									ret := -0.196721
				if( oscp > -5.79655 )
					if( tprice <= 205.552 )
						if( pvimin <= 0.175177 )
							if( verde_media <= 18.5825 )
								if( xrsi <= 46.3032 )
									ret := 0.307692
								if( xrsi > 46.3032 )
									ret := 0.922078 // buy
							if( verde_media > 18.5825 )
								if( stoc <= 77.5335 )
									ret := 0.125000
								if( stoc > 77.5335 )
									ret := -0.400000
						if( pvimin > 0.175177 )
							if( oscp <= 1.28838 )
								if( tprice <= 203.65 )
									ret := -0.438849
								if( tprice > 203.65 )
									ret := 0.272727
							if( oscp > 1.28838 )
								if( pvim <= 0.19552 )
									ret := 0.497778
								if( pvim > 0.19552 )
									ret := -0.013566
					if( tprice > 205.552 )
						if( pvimin <= 0.189981 )
							if( pvi <= 0.217543 )
								if( tprice <= 210.547 )
									ret := 0.344221
								if( tprice > 210.547 )
									ret := -0.208333
							if( pvi > 0.217543 )
								if( BollOsc <= 33.5574 )
									ret := -1.000000 // sell
								if( BollOsc > 33.5574 )
									ret := -0.875000 // sell
						if( pvimin > 0.189981 )
							if( marron <= 19.7408 )
								if( marron_mean <= 22.8528 )
									ret := 0.642857
								if( marron_mean > 22.8528 )
									ret := -0.379310
							if( marron > 19.7408 )
								if( nvi_ema <= 0.023529 )
									ret := 0.894737 // buy
								if( nvi_ema > 0.023529 )
									ret := -0.227061
			if( nvim > 0.09081 )
				if( BollOsc <= 0.917888 )
					if( nvimax <= 0.126586 )
						if( source <= 228.864 )
							if( pvi_ema <= 0.208577 )
								if( pvi_ema <= 0.19831 )
									ret := 0.888889 // buy
								if( pvi_ema > 0.19831 )
									ret := -0.066667
							if( pvi_ema > 0.208577 )
								if( nvi <= 0.102038 )
									ret := 0.836735 // buy
								if( nvi > 0.102038 )
									ret := 0.100000
						if( source > 228.864 )
							ret := -0.214286
					if( nvimax > 0.126586 )
						if( pvim <= 0.237398 )
							if( xrsi <= 39.583 )
								ret := 0.777778 // buy
							if( xrsi > 39.583 )
								ret := 0.071429
						if( pvim > 0.237398 )
							ret := -0.736842 // sell
				if( BollOsc > 0.917888 )
					if( pvi_ema <= 0.203644 )
						if( pvi <= 0.199502 )
							ret := -0.631579
						if( pvi > 0.199502 )
							if( xrsi <= 63.5101 )
								if( verde_media <= 13.6601 )
									ret := 0.457143
								if( verde_media > 13.6601 )
									ret := -0.750000 // sell
							if( xrsi > 63.5101 )
								if( verde_mean <= 144.105 )
									ret := 0.733333 // buy
								if( verde_mean > 144.105 )
									ret := 0.000000
					if( pvi_ema > 0.203644 )
						if( xmf <= 74.2764 )
							if( source <= 229.331 )
								if( media_azul <= 89.4565 )
									ret := -0.537500
								if( media_azul > 89.4565 )
									ret := 0.560000
							if( source > 229.331 )
								if( verde_media <= 29.7786 )
									ret := -0.967742 // sell
								if( verde_media > 29.7786 )
									ret := -0.500000
						if( xmf > 74.2764 )
							if( verde <= 119.02 )
								if( tprice <= 229.131 )
									ret := 0.733333 // buy
								if( tprice > 229.131 )
									ret := 0.066667
							if( verde > 119.02 )
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
float op_operation = decision_tree_0_QCOM_1Min_d5ef7073(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


