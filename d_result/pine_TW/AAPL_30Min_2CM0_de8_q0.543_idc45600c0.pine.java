//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AAPL_30Min_2CM0_c45600c0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_30Min_2CM0_c45600c0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_30Min_c45600c0(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 4.17212e+09 )
		if( Negative_Money_Flow_Sum <= 5.87166e+07 )
			if( Typical_Price <= 325.253 )
				if( Raw_Money_Flow <= 2.3714e+09 )
					if( Typical_Price <= 164.92 )
						if( Positive_Money_Flow_Sum <= 3.34149e+08 )
							if( Money_Flow_Ratio <= 9.60169 )
								if( Positive_Money_Flow_Sum <= 1.08381e+08 )
									ret := -0.012590
								if( Positive_Money_Flow_Sum > 1.08381e+08 )
									ret := 0.274390
							if( Money_Flow_Ratio > 9.60169 )
								if( ad <= 370617 )
									ret := -0.215613
								if( ad > 370617 )
									ret := -0.896552 // sell
						if( Positive_Money_Flow_Sum > 3.34149e+08 )
							if( MFI_High <= 19.7483 )
								if( Typical_Price <= 164.439 )
									ret := 0.130353
								if( Typical_Price > 164.439 )
									ret := -0.523810
							if( MFI_High > 19.7483 )
								if( Positive_Money_Flow_Sum <= 3.60978e+09 )
									ret := -0.331210
								if( Positive_Money_Flow_Sum > 3.60978e+09 )
									ret := 0.470588
					if( Typical_Price > 164.92 )
						if( MFI <= 98.9273 )
							if( mf <= 0.052908 )
								if( ad_mf <= 2.95424e+06 )
									ret := 0.159806
								if( ad_mf > 2.95424e+06 )
									ret := 0.739130 // buy
							if( mf > 0.052908 )
								if( Negative_Money_Flow <= 1.93884e+07 )
									ret := 0.004921
								if( Negative_Money_Flow > 1.93884e+07 )
									ret := 0.359091
						if( MFI > 98.9273 )
							if( Raw_Money_Flow <= 1.48947e+09 )
								if( MFI <= 99.8296 )
									ret := 0.216015
								if( MFI > 99.8296 )
									ret := -0.081967
							if( Raw_Money_Flow > 1.48947e+09 )
								if( Positive_Money_Flow <= 1.57218e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.57218e+09 )
									ret := 0.611111
				if( Raw_Money_Flow > 2.3714e+09 )
					if( MFI <= 98.3517 )
						ret := -0.600000
					if( MFI > 98.3517 )
						ret := -1.000000 // sell
			if( Typical_Price > 325.253 )
				if( Negative_Money_Flow_Sum <= 4.5676e+07 )
					if( Typical_Price <= 421.31 )
						if( MFI_Low <= 79.7047 )
							if( Positive_Money_Flow_Sum <= 4.00569e+09 )
								if( Typical_Price <= 354.733 )
									ret := 0.736842 // buy
								if( Typical_Price > 354.733 )
									ret := 0.057692
							if( Positive_Money_Flow_Sum > 4.00569e+09 )
								ret := 0.842105 // buy
						if( MFI_Low > 79.7047 )
							ret := -0.300000
					if( Typical_Price > 421.31 )
						if( Positive_Money_Flow_Sum <= 4.30842e+09 )
							ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 4.30842e+09 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 4.5676e+07 )
					if( Typical_Price <= 385.675 )
						ret := 1.000000 // buy
					if( Typical_Price > 385.675 )
						ret := 0.600000
		if( Negative_Money_Flow_Sum > 5.87166e+07 )
			if( Raw_Money_Flow <= 2.12529e+09 )
				if( MFI_High <= -79.0424 )
					if( MFI <= 0.775371 )
						if( MFI <= 0.671596 )
							if( MFI_High <= -79.3388 )
								if( Money_Flow_Ratio <= 0.004771 )
									ret := 0.187500
								if( Money_Flow_Ratio > 0.004771 )
									ret := -0.005277
							if( MFI_High > -79.3388 )
								if( mf <= -0.208873 )
									ret := 0.714286 // buy
								if( mf > -0.208873 )
									ret := 0.785714 // buy
						if( MFI > 0.671596 )
							if( Negative_Money_Flow <= 9.68875e+08 )
								if( Negative_Money_Flow <= 651775 )
									ret := 0.151515
								if( Negative_Money_Flow > 651775 )
									ret := -0.201550
							if( Negative_Money_Flow > 9.68875e+08 )
								ret := -0.944444 // sell
					if( MFI > 0.775371 )
						if( Negative_Money_Flow_Sum <= 6.29672e+08 )
							if( ad <= 1850.26 )
								ret := -0.476190
							if( ad > 1850.26 )
								ret := 0.545455
						if( Negative_Money_Flow_Sum > 6.29672e+08 )
							if( ad_mf <= 25573.4 )
								if( Typical_Price <= 181.881 )
									ret := 0.405714
								if( Typical_Price > 181.881 )
									ret := -0.022989
							if( ad_mf > 25573.4 )
								if( Positive_Money_Flow_Sum <= 1.23635e+07 )
									ret := 0.842105 // buy
								if( Positive_Money_Flow_Sum > 1.23635e+07 )
									ret := 0.500000
				if( MFI_High > -79.0424 )
					if( Typical_Price <= 290.958 )
						if( Money_Flow_Ratio <= 1.69555 )
							if( ad_mf <= -3.90368e+06 )
								if( mf <= -0.528234 )
									ret := 0.456522
								if( mf > -0.528234 )
									ret := 0.066242
							if( ad_mf > -3.90368e+06 )
								if( Money_Flow_Ratio <= 1.27843 )
									ret := -0.007940
								if( Money_Flow_Ratio > 1.27843 )
									ret := -0.082341
						if( Money_Flow_Ratio > 1.69555 )
							if( Positive_Money_Flow_Sum <= 1.87347e+09 )
								if( Positive_Money_Flow <= 1.51413e+09 )
									ret := 0.097466
								if( Positive_Money_Flow > 1.51413e+09 )
									ret := -0.300000
							if( Positive_Money_Flow_Sum > 1.87347e+09 )
								if( Money_Flow_Ratio <= 5.70531 )
									ret := 0.021975
								if( Money_Flow_Ratio > 5.70531 )
									ret := -0.065831
					if( Typical_Price > 290.958 )
						if( MFI_Low <= 21.0444 )
							if( Positive_Money_Flow_Sum <= 6.10822e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 6.10822e+06 )
								if( Money_Flow_Ratio <= 0.682196 )
									ret := -0.008463
								if( Money_Flow_Ratio > 0.682196 )
									ret := -0.571429
						if( MFI_Low > 21.0444 )
							if( mf <= -0.574307 )
								ret := -0.916667 // sell
							if( mf > -0.574307 )
								if( ad_mf <= -740446 )
									ret := -0.140562
								if( ad_mf > -740446 )
									ret := 0.205603
			if( Raw_Money_Flow > 2.12529e+09 )
				if( Positive_Money_Flow <= 2.76329e+09 )
					if( Raw_Money_Flow <= 3.00718e+09 )
						if( Raw_Money_Flow <= 2.3453e+09 )
							if( Typical_Price <= 160.641 )
								if( MFI_High <= -73.1044 )
									ret := -0.878788 // sell
								if( MFI_High > -73.1044 )
									ret := -0.138462
							if( Typical_Price > 160.641 )
								if( MFI_Low <= 75.966 )
									ret := -0.808989 // sell
								if( MFI_Low > 75.966 )
									ret := 0.100000
						if( Raw_Money_Flow > 2.3453e+09 )
							if( mf <= -0.438127 )
								if( Negative_Money_Flow_Sum <= 2.73333e+09 )
									ret := 0.814815 // buy
								if( Negative_Money_Flow_Sum > 2.73333e+09 )
									ret := -0.307692
							if( mf > -0.438127 )
								if( MFI_High <= -68.0233 )
									ret := -0.658537
								if( MFI_High > -68.0233 )
									ret := -0.190698
					if( Raw_Money_Flow > 3.00718e+09 )
						if( MFI <= 11.8915 )
							if( MFI <= 4.19342 )
								ret := -0.300000
							if( MFI > 4.19342 )
								if( Positive_Money_Flow_Sum <= 3.48591e+08 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 3.48591e+08 )
									ret := 0.200000
						if( MFI > 11.8915 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow > 2.76329e+09 )
					if( ad_mf <= 5.14623e+06 )
						if( ad <= 3.15516e+06 )
							if( MFI_High <= 16.6164 )
								if( MFI_High <= 13.3917 )
									ret := -0.261905
								if( MFI_High > 13.3917 )
									ret := 0.619048
							if( MFI_High > 16.6164 )
								if( Money_Flow_Ratio <= 50.2254 )
									ret := -0.642857
								if( Money_Flow_Ratio > 50.2254 )
									ret := -0.083333
						if( ad > 3.15516e+06 )
							if( Positive_Money_Flow <= 4.19313e+09 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 4.19313e+09 )
								ret := -0.750000 // sell
					if( ad_mf > 5.14623e+06 )
						if( mf <= 0.420897 )
							if( Negative_Money_Flow_Sum <= 1.17377e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.17377e+08 )
								if( Money_Flow_Ratio <= 4.34511 )
									ret := 0.076923
								if( Money_Flow_Ratio > 4.34511 )
									ret := 0.653846
						if( mf > 0.420897 )
							if( ad_mf <= 1.90363e+07 )
								if( MFI_Low <= 74.2571 )
									ret := -0.500000
								if( MFI_Low > 74.2571 )
									ret := 0.431818
							if( ad_mf > 1.90363e+07 )
								if( Negative_Money_Flow_Sum <= 1.97417e+08 )
									ret := 0.100000
								if( Negative_Money_Flow_Sum > 1.97417e+08 )
									ret := -0.842105 // sell
	if( Negative_Money_Flow_Sum > 4.17212e+09 )
		if( Raw_Money_Flow <= 4.23575e+08 )
			if( MFI_High <= -42.534 )
				if( Typical_Price <= 122.653 )
					if( Raw_Money_Flow <= 3.34234e+08 )
						if( mf <= 0.055476 )
							if( MFI <= 16.0658 )
								if( MFI_High <= -68.8153 )
									ret := 0.433333
								if( MFI_High > -68.8153 )
									ret := -0.125000
							if( MFI > 16.0658 )
								if( Typical_Price <= 120.566 )
									ret := 0.728814 // buy
								if( Typical_Price > 120.566 )
									ret := 0.391304
						if( mf > 0.055476 )
							if( Negative_Money_Flow_Sum <= 8.09885e+09 )
								ret := -0.590909
							if( Negative_Money_Flow_Sum > 8.09885e+09 )
								ret := 0.545455
					if( Raw_Money_Flow > 3.34234e+08 )
						ret := -0.714286 // sell
				if( Typical_Price > 122.653 )
					if( Raw_Money_Flow <= 1.87615e+08 )
						if( ad_mf <= -90500.2 )
							if( mf <= -0.3479 )
								if( MFI_Low <= -19.703 )
									ret := -1.000000 // sell
								if( MFI_Low > -19.703 )
									ret := -0.074074
							if( mf > -0.3479 )
								if( MFI_High <= -72.301 )
									ret := 0.812500 // buy
								if( MFI_High > -72.301 )
									ret := 0.312500
						if( ad_mf > -90500.2 )
							if( mf <= -0.05303 )
								if( Money_Flow_Ratio <= 0.40029 )
									ret := -0.110272
								if( Money_Flow_Ratio > 0.40029 )
									ret := 0.232422
							if( mf > -0.05303 )
								if( Positive_Money_Flow <= 3.68176e+06 )
									ret := 0.040275
								if( Positive_Money_Flow > 3.68176e+06 )
									ret := 0.301741
					if( Raw_Money_Flow > 1.87615e+08 )
						if( Positive_Money_Flow_Sum <= 1.39241e+09 )
							if( Raw_Money_Flow <= 3.93332e+08 )
								if( Typical_Price <= 150.572 )
									ret := 0.500000
								if( Typical_Price > 150.572 )
									ret := -0.255172
							if( Raw_Money_Flow > 3.93332e+08 )
								if( Negative_Money_Flow_Sum <= 5.14041e+09 )
									ret := 0.757576 // buy
								if( Negative_Money_Flow_Sum > 5.14041e+09 )
									ret := 0.400000
						if( Positive_Money_Flow_Sum > 1.39241e+09 )
							if( Typical_Price <= 241.958 )
								if( mf <= -0.100873 )
									ret := -0.021505
								if( mf > -0.100873 )
									ret := -0.510204
							if( Typical_Price > 241.958 )
								if( ad <= -819332 )
									ret := -0.384615
								if( ad > -819332 )
									ret := -0.863636 // sell
			if( MFI_High > -42.534 )
				if( Negative_Money_Flow <= 3.77822e+08 )
					if( mf <= -0.297883 )
						if( MFI_Low <= 19.0566 )
							ret := -0.812500 // sell
						if( MFI_Low > 19.0566 )
							if( ad <= -3910.96 )
								if( Negative_Money_Flow_Sum <= 5.10293e+09 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 5.10293e+09 )
									ret := 0.600000
							if( ad > -3910.96 )
								if( Positive_Money_Flow_Sum <= 5.775e+09 )
									ret := 0.739130 // buy
								if( Positive_Money_Flow_Sum > 5.775e+09 )
									ret := 1.000000 // buy
					if( mf > -0.297883 )
						if( mf <= 0.13818 )
							if( Positive_Money_Flow_Sum <= 3.35431e+09 )
								if( Positive_Money_Flow <= 5.64855e+06 )
									ret := 0.018692
								if( Positive_Money_Flow > 5.64855e+06 )
									ret := 0.457143
							if( Positive_Money_Flow_Sum > 3.35431e+09 )
								if( Negative_Money_Flow <= 177541 )
									ret := -0.136445
								if( Negative_Money_Flow > 177541 )
									ret := -0.284600
						if( mf > 0.13818 )
							if( MFI_High <= -13.5224 )
								if( Money_Flow_Ratio <= 1.51491 )
									ret := 0.098237
								if( Money_Flow_Ratio > 1.51491 )
									ret := -0.470588
							if( MFI_High > -13.5224 )
								if( Raw_Money_Flow <= 1.84454e+07 )
									ret := -0.071429
								if( Raw_Money_Flow > 1.84454e+07 )
									ret := 0.551020
				if( Negative_Money_Flow > 3.77822e+08 )
					if( Money_Flow_Ratio <= 0.887203 )
						ret := 0.388889
					if( Money_Flow_Ratio > 0.887203 )
						ret := 1.000000 // buy
		if( Raw_Money_Flow > 4.23575e+08 )
			if( Money_Flow_Ratio <= 2.83197 )
				if( ad_mf <= -1.81881e+06 )
					if( Positive_Money_Flow_Sum <= 1.13641e+09 )
						if( MFI_Low <= -18.5813 )
							if( mf <= -0.550943 )
								ret := 0.000000
							if( mf > -0.550943 )
								if( MFI_High <= -78.8098 )
									ret := -0.661972
								if( MFI_High > -78.8098 )
									ret := -1.000000 // sell
						if( MFI_Low > -18.5813 )
							if( MFI <= 1.97541 )
								if( Money_Flow_Ratio <= 0.018304 )
									ret := 0.382353
								if( Money_Flow_Ratio > 0.018304 )
									ret := -0.600000
							if( MFI > 1.97541 )
								if( Negative_Money_Flow <= 8.16184e+08 )
									ret := 0.104167
								if( Negative_Money_Flow > 8.16184e+08 )
									ret := 0.611321
					if( Positive_Money_Flow_Sum > 1.13641e+09 )
						if( Money_Flow_Ratio <= 1.47309 )
							if( Positive_Money_Flow_Sum <= 1.27891e+09 )
								if( MFI <= 19.7264 )
									ret := -0.888889 // sell
								if( MFI > 19.7264 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.27891e+09 )
								if( mf <= -0.090006 )
									ret := -0.027938
								if( mf > -0.090006 )
									ret := -0.222094
						if( Money_Flow_Ratio > 1.47309 )
							if( Negative_Money_Flow_Sum <= 4.70032e+09 )
								if( MFI_Low <= 42.2271 )
									ret := 0.333333
								if( MFI_Low > 42.2271 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 4.70032e+09 )
								if( ad <= -2.60982e+06 )
									ret := 0.625000
								if( ad > -2.60982e+06 )
									ret := -0.357143
				if( ad_mf > -1.81881e+06 )
					if( Positive_Money_Flow_Sum <= 3.1245e+09 )
						if( Typical_Price <= 155.628 )
							if( Negative_Money_Flow <= 1.40452e+09 )
								if( MFI_Low <= 4.62193 )
									ret := -0.032000
								if( MFI_Low > 4.62193 )
									ret := -0.310811
							if( Negative_Money_Flow > 1.40452e+09 )
								if( MFI <= 5.9352 )
									ret := -0.750000 // sell
								if( MFI > 5.9352 )
									ret := -0.025641
						if( Typical_Price > 155.628 )
							if( Negative_Money_Flow_Sum <= 7.48673e+09 )
								if( Positive_Money_Flow <= 1.33856e+09 )
									ret := -0.358974
								if( Positive_Money_Flow > 1.33856e+09 )
									ret := 0.928571 // buy
							if( Negative_Money_Flow_Sum > 7.48673e+09 )
								if( Positive_Money_Flow <= 1.00327e+09 )
									ret := -0.667939
								if( Positive_Money_Flow > 1.00327e+09 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 3.1245e+09 )
						if( Positive_Money_Flow_Sum <= 6.92284e+09 )
							if( Money_Flow_Ratio <= 1.21202 )
								if( Typical_Price <= 242.335 )
									ret := 0.072482
								if( Typical_Price > 242.335 )
									ret := -0.216301
							if( Money_Flow_Ratio > 1.21202 )
								if( mf <= 0.164077 )
									ret := -0.584507
								if( mf > 0.164077 )
									ret := 0.043478
						if( Positive_Money_Flow_Sum > 6.92284e+09 )
							if( Raw_Money_Flow <= 1.01944e+09 )
								if( Positive_Money_Flow_Sum <= 7.63061e+09 )
									ret := -0.226415
								if( Positive_Money_Flow_Sum > 7.63061e+09 )
									ret := -0.640316
							if( Raw_Money_Flow > 1.01944e+09 )
								if( ad <= 4.60225e+06 )
									ret := -0.085784
								if( ad > 4.60225e+06 )
									ret := -0.537671
			if( Money_Flow_Ratio > 2.83197 )
				if( MFI_Low <= 60.9782 )
					if( Typical_Price <= 197.116 )
						ret := -0.187500
					if( Typical_Price > 197.116 )
						if( Money_Flow_Ratio <= 2.96417 )
							ret := 0.636364
						if( Money_Flow_Ratio > 2.96417 )
							if( ad <= 3.0796e+06 )
								ret := 1.000000 // buy
							if( ad > 3.0796e+06 )
								ret := 0.882353 // buy
				if( MFI_Low > 60.9782 )
					ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_AAPL_30Min_c45600c0(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


