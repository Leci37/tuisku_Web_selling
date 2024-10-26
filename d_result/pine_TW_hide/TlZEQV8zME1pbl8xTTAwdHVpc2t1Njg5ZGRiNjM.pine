//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: NVDA_30Min_1M00_689ddb63 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1M00_689ddb63", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_689ddb63(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 9.33064e+07 )
		if( MFI_High <= -0.127407 )
			if( Positive_Money_Flow_Sum <= 1.8527e+06 )
				if( Money_Flow_Ratio <= 0.111639 )
					if( Negative_Money_Flow <= 1.91051e+07 )
						if( Negative_Money_Flow_Sum <= 1.78878e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.78878e+07 )
							if( MFI <= 3.0458 )
								if( Negative_Money_Flow <= 9.43825e+06 )
									ret := 0.041958
								if( Negative_Money_Flow > 9.43825e+06 )
									ret := -0.545455
							if( MFI > 3.0458 )
								ret := 0.764706 // buy
					if( Negative_Money_Flow > 1.91051e+07 )
						if( Negative_Money_Flow_Sum <= 2.34512e+08 )
							if( MFI_Low <= -19.4744 )
								if( Typical_Price <= 55.6748 )
									ret := 0.769231 // buy
								if( Typical_Price > 55.6748 )
									ret := 0.357143
							if( MFI_Low > -19.4744 )
								if( MFI <= 0.717291 )
									ret := 1.000000 // buy
								if( MFI > 0.717291 )
									ret := 0.687500
						if( Negative_Money_Flow_Sum > 2.34512e+08 )
							if( Typical_Price <= 62.1436 )
								ret := -0.500000
							if( Typical_Price > 62.1436 )
								ret := 0.450000
				if( Money_Flow_Ratio > 0.111639 )
					if( MFI_Low <= 1.14588 )
						if( Negative_Money_Flow <= 3.45909e+06 )
							if( Negative_Money_Flow_Sum <= 6.654e+06 )
								if( MFI <= 18.033 )
									ret := 0.600000
								if( MFI > 18.033 )
									ret := 0.769231 // buy
							if( Negative_Money_Flow_Sum > 6.654e+06 )
								if( Raw_Money_Flow <= 838446 )
									ret := 0.714286 // buy
								if( Raw_Money_Flow > 838446 )
									ret := 0.957447 // buy
						if( Negative_Money_Flow > 3.45909e+06 )
							ret := 0.000000
					if( MFI_Low > 1.14588 )
						if( Typical_Price <= 95.273 )
							ret := 0.578947
						if( Typical_Price > 95.273 )
							ret := -0.333333
			if( Positive_Money_Flow_Sum > 1.8527e+06 )
				if( Negative_Money_Flow_Sum <= 4.82379e+06 )
					if( MFI <= 57.1683 )
						if( Money_Flow_Ratio <= 0.990417 )
							if( MFI_High <= -35.8861 )
								if( Raw_Money_Flow <= 1.05899e+06 )
									ret := -0.636364
								if( Raw_Money_Flow > 1.05899e+06 )
									ret := -0.923077 // sell
							if( MFI_High > -35.8861 )
								if( Negative_Money_Flow_Sum <= 3.03959e+06 )
									ret := 0.111111
								if( Negative_Money_Flow_Sum > 3.03959e+06 )
									ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.990417 )
							if( Raw_Money_Flow <= 1.84035e+06 )
								if( Negative_Money_Flow_Sum <= 3.75731e+06 )
									ret := 0.730769 // buy
								if( Negative_Money_Flow_Sum > 3.75731e+06 )
									ret := 0.166667
							if( Raw_Money_Flow > 1.84035e+06 )
								ret := -0.300000
					if( MFI > 57.1683 )
						if( Positive_Money_Flow <= 363581 )
							if( Typical_Price <= 173.798 )
								ret := 0.000000
							if( Typical_Price > 173.798 )
								if( MFI_Low <= 45.6161 )
									ret := 0.200000
								if( MFI_Low > 45.6161 )
									ret := 0.764706 // buy
						if( Positive_Money_Flow > 363581 )
							if( Positive_Money_Flow_Sum <= 4.604e+06 )
								ret := 0.300000
							if( Positive_Money_Flow_Sum > 4.604e+06 )
								if( Positive_Money_Flow <= 5.30715e+06 )
									ret := -0.718310 // sell
								if( Positive_Money_Flow > 5.30715e+06 )
									ret := 0.142857
				if( Negative_Money_Flow_Sum > 4.82379e+06 )
					if( Negative_Money_Flow_Sum <= 7.59815e+09 )
						if( Typical_Price <= 114.342 )
							if( MFI_Low <= 8.08855 )
								if( MFI_Low <= -8.40892 )
									ret := 0.166052
								if( MFI_Low > -8.40892 )
									ret := -0.073191
							if( MFI_Low > 8.08855 )
								if( Positive_Money_Flow_Sum <= 7.86144e+07 )
									ret := 0.261456
								if( Positive_Money_Flow_Sum > 7.86144e+07 )
									ret := 0.053780
						if( Typical_Price > 114.342 )
							if( Money_Flow_Ratio <= 3.96598 )
								if( Positive_Money_Flow <= 8.20553e+07 )
									ret := 0.006305
								if( Positive_Money_Flow > 8.20553e+07 )
									ret := -0.063117
							if( Money_Flow_Ratio > 3.96598 )
								if( Raw_Money_Flow <= 6.2608e+07 )
									ret := -0.947368 // sell
								if( Raw_Money_Flow > 6.2608e+07 )
									ret := -0.578947
					if( Negative_Money_Flow_Sum > 7.59815e+09 )
						if( MFI <= 1.11471 )
							if( Raw_Money_Flow <= 6.50866e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 6.50866e+06 )
								ret := -0.363636
						if( MFI > 1.11471 )
							if( Positive_Money_Flow <= 1.33473e+09 )
								if( Raw_Money_Flow <= 2.17441e+07 )
									ret := 0.076208
								if( Raw_Money_Flow > 2.17441e+07 )
									ret := 0.239095
							if( Positive_Money_Flow > 1.33473e+09 )
								if( MFI_High <= -25.1135 )
									ret := -0.222785
								if( MFI_High > -25.1135 )
									ret := 0.017751
		if( MFI_High > -0.127407 )
			if( Money_Flow_Ratio <= 13.3627 )
				if( Negative_Money_Flow <= 3.42254e+06 )
					if( Negative_Money_Flow_Sum <= 2.63412e+09 )
						if( MFI_High <= 9.88437 )
							if( Positive_Money_Flow <= 1.36199e+07 )
								if( Positive_Money_Flow_Sum <= 6.56199e+07 )
									ret := -0.063529
								if( Positive_Money_Flow_Sum > 6.56199e+07 )
									ret := 0.123007
							if( Positive_Money_Flow > 1.36199e+07 )
								if( Negative_Money_Flow_Sum <= 7.29049e+07 )
									ret := -0.343964
								if( Negative_Money_Flow_Sum > 7.29049e+07 )
									ret := -0.001121
						if( MFI_High > 9.88437 )
							if( Positive_Money_Flow <= 3.60294e+09 )
								if( Negative_Money_Flow_Sum <= 1.01853e+09 )
									ret := 0.259980
								if( Negative_Money_Flow_Sum > 1.01853e+09 )
									ret := -0.300000
							if( Positive_Money_Flow > 3.60294e+09 )
								if( Raw_Money_Flow <= 5.09476e+09 )
									ret := -0.810811 // sell
								if( Raw_Money_Flow > 5.09476e+09 )
									ret := 0.275862
					if( Negative_Money_Flow_Sum > 2.63412e+09 )
						if( MFI_Low <= 70.8907 )
							if( MFI_Low <= 68.0365 )
								if( Negative_Money_Flow_Sum <= 5.92308e+09 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 5.92308e+09 )
									ret := 0.812500 // buy
							if( MFI_Low > 68.0365 )
								if( Typical_Price <= 778.447 )
									ret := 0.750000 // buy
								if( Typical_Price > 778.447 )
									ret := 1.000000 // buy
						if( MFI_Low > 70.8907 )
							if( MFI_High <= 12.0005 )
								ret := -0.583333
							if( MFI_High > 12.0005 )
								ret := -0.111111
				if( Negative_Money_Flow > 3.42254e+06 )
					if( Positive_Money_Flow_Sum <= 3.90256e+07 )
						ret := -0.937500 // sell
					if( Positive_Money_Flow_Sum > 3.90256e+07 )
						if( Positive_Money_Flow <= 3.57601e+06 )
							if( MFI_Low <= 63.5335 )
								if( MFI <= 82.8028 )
									ret := 0.222222
								if( MFI > 82.8028 )
									ret := -0.254902
							if( MFI_Low > 63.5335 )
								if( Negative_Money_Flow <= 5.78404e+06 )
									ret := 0.154762
								if( Negative_Money_Flow > 5.78404e+06 )
									ret := 0.470430
						if( Positive_Money_Flow > 3.57601e+06 )
							if( Money_Flow_Ratio <= 4.2821 )
								ret := 0.500000
							if( Money_Flow_Ratio > 4.2821 )
								if( Negative_Money_Flow_Sum <= 3.13852e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.13852e+09 )
									ret := 0.777778 // buy
			if( Money_Flow_Ratio > 13.3627 )
				if( Raw_Money_Flow <= 8.69061e+08 )
					if( Money_Flow_Ratio <= 205.866 )
						if( Positive_Money_Flow <= 4.08057e+08 )
							if( Positive_Money_Flow <= 3.79127e+08 )
								if( Negative_Money_Flow_Sum <= 1.89165e+08 )
									ret := -0.035088
								if( Negative_Money_Flow_Sum > 1.89165e+08 )
									ret := 0.216049
							if( Positive_Money_Flow > 3.79127e+08 )
								if( Typical_Price <= 201.325 )
									ret := 0.062500
								if( Typical_Price > 201.325 )
									ret := 0.607843
						if( Positive_Money_Flow > 4.08057e+08 )
							if( Positive_Money_Flow_Sum <= 5.86359e+08 )
								if( Money_Flow_Ratio <= 32.2323 )
									ret := -0.396825
								if( Money_Flow_Ratio > 32.2323 )
									ret := 0.135135
							if( Positive_Money_Flow_Sum > 5.86359e+08 )
								if( Raw_Money_Flow <= 7.74927e+08 )
									ret := -0.400901
								if( Raw_Money_Flow > 7.74927e+08 )
									ret := -0.016304
					if( Money_Flow_Ratio > 205.866 )
						if( Positive_Money_Flow <= 4.9384e+08 )
							if( Negative_Money_Flow_Sum <= 1.46105e+07 )
								if( Positive_Money_Flow <= 2.92675e+08 )
									ret := 0.113692
								if( Positive_Money_Flow > 2.92675e+08 )
									ret := -0.450980
							if( Negative_Money_Flow_Sum > 1.46105e+07 )
								if( MFI_High <= 18.779 )
									ret := 0.384615
								if( MFI_High > 18.779 )
									ret := 0.745098 // buy
						if( Positive_Money_Flow > 4.9384e+08 )
							if( Positive_Money_Flow <= 5.47145e+08 )
								if( MFI_High <= 19.565 )
									ret := 0.333333
								if( MFI_High > 19.565 )
									ret := 0.956522 // buy
							if( Positive_Money_Flow > 5.47145e+08 )
								if( Positive_Money_Flow_Sum <= 5.56947e+09 )
									ret := 0.230769
								if( Positive_Money_Flow_Sum > 5.56947e+09 )
									ret := 1.000000 // buy
				if( Raw_Money_Flow > 8.69061e+08 )
					if( MFI_Low <= 76.3451 )
						if( Raw_Money_Flow <= 1.16975e+09 )
							if( MFI_High <= 13.2891 )
								ret := -0.500000
							if( MFI_High > 13.2891 )
								if( MFI_Low <= 74.6065 )
									ret := 0.352941
								if( MFI_Low > 74.6065 )
									ret := 0.776316 // buy
						if( Raw_Money_Flow > 1.16975e+09 )
							if( Positive_Money_Flow <= 1.2953e+09 )
								if( Positive_Money_Flow_Sum <= 1.26911e+09 )
									ret := 0.785714 // buy
								if( Positive_Money_Flow_Sum > 1.26911e+09 )
									ret := -0.962963 // sell
							if( Positive_Money_Flow > 1.2953e+09 )
								if( Typical_Price <= 439.459 )
									ret := -0.135770
								if( Typical_Price > 439.459 )
									ret := 0.286822
					if( MFI_Low > 76.3451 )
						if( Positive_Money_Flow <= 1.05285e+09 )
							if( MFI_Low <= 77.8745 )
								if( Positive_Money_Flow_Sum <= 9.48672e+08 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 9.48672e+08 )
									ret := 0.802817 // buy
							if( MFI_Low > 77.8745 )
								if( Raw_Money_Flow <= 9.23726e+08 )
									ret := -0.269231
								if( Raw_Money_Flow > 9.23726e+08 )
									ret := 0.584270
						if( Positive_Money_Flow > 1.05285e+09 )
							if( MFI_High <= 16.9788 )
								if( Positive_Money_Flow_Sum <= 4.93119e+09 )
									ret := 0.330000
								if( Positive_Money_Flow_Sum > 4.93119e+09 )
									ret := -0.129032
							if( MFI_High > 16.9788 )
								if( Positive_Money_Flow_Sum <= 1.14067e+09 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.14067e+09 )
									ret := 0.348802
	if( Negative_Money_Flow > 9.33064e+07 )
		if( MFI_High <= -14.4785 )
			if( Raw_Money_Flow <= 2.18013e+09 )
				if( Raw_Money_Flow <= 1.43231e+08 )
					if( Positive_Money_Flow_Sum <= 7.53333e+08 )
						if( Positive_Money_Flow_Sum <= 6.32328e+08 )
							if( Positive_Money_Flow_Sum <= 1.38791e+06 )
								ret := 0.538462
							if( Positive_Money_Flow_Sum > 1.38791e+06 )
								if( Negative_Money_Flow_Sum <= 1.85128e+09 )
									ret := -0.226316
								if( Negative_Money_Flow_Sum > 1.85128e+09 )
									ret := 0.362319
						if( Positive_Money_Flow_Sum > 6.32328e+08 )
							if( Negative_Money_Flow_Sum <= 1.68935e+09 )
								if( Negative_Money_Flow_Sum <= 6.4608e+08 )
									ret := -0.808511 // sell
								if( Negative_Money_Flow_Sum > 6.4608e+08 )
									ret := -0.568421
							if( Negative_Money_Flow_Sum > 1.68935e+09 )
								ret := 0.400000
					if( Positive_Money_Flow_Sum > 7.53333e+08 )
						if( Raw_Money_Flow <= 1.12896e+08 )
							if( MFI_Low <= 16.406 )
								if( MFI <= 33.3288 )
									ret := -0.100000
								if( MFI > 33.3288 )
									ret := -0.454545
							if( MFI_Low > 16.406 )
								if( Negative_Money_Flow <= 1.07998e+08 )
									ret := 0.287958
								if( Negative_Money_Flow > 1.07998e+08 )
									ret := 0.564103
						if( Raw_Money_Flow > 1.12896e+08 )
							if( MFI_High <= -40.0828 )
								if( Typical_Price <= 248.839 )
									ret := 0.372549
								if( Typical_Price > 248.839 )
									ret := -0.230769
							if( MFI_High > -40.0828 )
								if( Money_Flow_Ratio <= 1.16341 )
									ret := -0.404545
								if( Money_Flow_Ratio > 1.16341 )
									ret := -0.021739
				if( Raw_Money_Flow > 1.43231e+08 )
					if( Positive_Money_Flow_Sum <= 5.48884e+08 )
						if( Negative_Money_Flow <= 1.96873e+08 )
							if( Negative_Money_Flow_Sum <= 6.68963e+08 )
								if( Raw_Money_Flow <= 1.62493e+08 )
									ret := -0.065990
								if( Raw_Money_Flow > 1.62493e+08 )
									ret := 0.593750
							if( Negative_Money_Flow_Sum > 6.68963e+08 )
								if( Positive_Money_Flow_Sum <= 4.30583e+08 )
									ret := -0.038043
								if( Positive_Money_Flow_Sum > 4.30583e+08 )
									ret := 0.303571
						if( Negative_Money_Flow > 1.96873e+08 )
							if( MFI_High <= -73.6011 )
								if( Negative_Money_Flow <= 3.31712e+08 )
									ret := -0.327744
								if( Negative_Money_Flow > 3.31712e+08 )
									ret := -0.039515
							if( MFI_High > -73.6011 )
								if( Negative_Money_Flow_Sum <= 2.35281e+09 )
									ret := 0.173014
								if( Negative_Money_Flow_Sum > 2.35281e+09 )
									ret := -0.233083
					if( Positive_Money_Flow_Sum > 5.48884e+08 )
						if( Positive_Money_Flow_Sum <= 8.79786e+08 )
							if( Money_Flow_Ratio <= 1.74213 )
								if( Money_Flow_Ratio <= 0.144669 )
									ret := 0.059524
								if( Money_Flow_Ratio > 0.144669 )
									ret := -0.316141
							if( Money_Flow_Ratio > 1.74213 )
								if( Raw_Money_Flow <= 3.26926e+08 )
									ret := 0.000000
								if( Raw_Money_Flow > 3.26926e+08 )
									ret := 0.923077 // buy
						if( Positive_Money_Flow_Sum > 8.79786e+08 )
							if( Money_Flow_Ratio <= 0.414549 )
								if( Typical_Price <= 943.188 )
									ret := -0.209084
								if( Typical_Price > 943.188 )
									ret := 0.933333 // buy
							if( Money_Flow_Ratio > 0.414549 )
								if( MFI_High <= -40.4708 )
									ret := 0.092551
								if( MFI_High > -40.4708 )
									ret := -0.105693
			if( Raw_Money_Flow > 2.18013e+09 )
				if( MFI <= 54.1415 )
					if( MFI <= 7.02672 )
						if( Typical_Price <= 390.364 )
							if( Negative_Money_Flow_Sum <= 1.54958e+10 )
								if( Negative_Money_Flow <= 4.01755e+09 )
									ret := -0.900826 // sell
								if( Negative_Money_Flow > 4.01755e+09 )
									ret := -0.675000
							if( Negative_Money_Flow_Sum > 1.54958e+10 )
								if( Money_Flow_Ratio <= 0.029224 )
									ret := 0.125000
								if( Money_Flow_Ratio > 0.029224 )
									ret := 0.680000
						if( Typical_Price > 390.364 )
							if( Positive_Money_Flow_Sum <= 3.80014e+08 )
								if( Negative_Money_Flow <= 3.94335e+09 )
									ret := 0.123288
								if( Negative_Money_Flow > 3.94335e+09 )
									ret := 0.942029 // buy
							if( Positive_Money_Flow_Sum > 3.80014e+08 )
								if( Positive_Money_Flow_Sum <= 4.72933e+08 )
									ret := -0.516129
								if( Positive_Money_Flow_Sum > 4.72933e+08 )
									ret := 0.166667
					if( MFI > 7.02672 )
						if( Negative_Money_Flow <= 2.48025e+09 )
							if( Typical_Price <= 853.778 )
								if( Negative_Money_Flow_Sum <= 4.5778e+09 )
									ret := -0.117647
								if( Negative_Money_Flow_Sum > 4.5778e+09 )
									ret := -0.696552
							if( Typical_Price > 853.778 )
								if( MFI_Low <= 10.0523 )
									ret := 0.428571
								if( MFI_Low > 10.0523 )
									ret := -0.666667
						if( Negative_Money_Flow > 2.48025e+09 )
							if( Typical_Price <= 400.734 )
								if( MFI <= 47.9099 )
									ret := -0.486166
								if( MFI > 47.9099 )
									ret := 0.235294
							if( Typical_Price > 400.734 )
								if( Negative_Money_Flow <= 7.72337e+09 )
									ret := -0.301075
								if( Negative_Money_Flow > 7.72337e+09 )
									ret := 0.607143
				if( MFI > 54.1415 )
					if( Typical_Price <= 564.392 )
						if( Negative_Money_Flow_Sum <= 3.01328e+09 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.01328e+09 )
							if( Money_Flow_Ratio <= 1.27682 )
								ret := 0.636364
							if( Money_Flow_Ratio > 1.27682 )
								if( Positive_Money_Flow_Sum <= 1.00128e+10 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 1.00128e+10 )
									ret := -0.200000
					if( Typical_Price > 564.392 )
						if( Positive_Money_Flow_Sum <= 2.37022e+10 )
							if( Positive_Money_Flow_Sum <= 1.19824e+10 )
								ret := 0.619048
							if( Positive_Money_Flow_Sum > 1.19824e+10 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.37022e+10 )
							ret := 0.047619
		if( MFI_High > -14.4785 )
			if( Negative_Money_Flow_Sum <= 6.74789e+08 )
				if( Positive_Money_Flow_Sum <= 2.75267e+09 )
					if( Typical_Price <= 209.474 )
						if( Negative_Money_Flow_Sum <= 1.26462e+08 )
							if( Typical_Price <= 148.895 )
								if( Negative_Money_Flow_Sum <= 1.12114e+08 )
									ret := 0.866667 // buy
								if( Negative_Money_Flow_Sum > 1.12114e+08 )
									ret := 1.000000 // buy
							if( Typical_Price > 148.895 )
								if( Raw_Money_Flow <= 1.05654e+08 )
									ret := -0.428571
								if( Raw_Money_Flow > 1.05654e+08 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.26462e+08 )
							if( Negative_Money_Flow_Sum <= 1.73508e+08 )
								if( Raw_Money_Flow <= 1.56393e+08 )
									ret := -0.074627
								if( Raw_Money_Flow > 1.56393e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.73508e+08 )
								if( Typical_Price <= 157.44 )
									ret := 0.256303
								if( Typical_Price > 157.44 )
									ret := 0.060000
					if( Typical_Price > 209.474 )
						if( Negative_Money_Flow_Sum <= 3.36669e+08 )
							if( Positive_Money_Flow_Sum <= 2.02825e+09 )
								if( Negative_Money_Flow_Sum <= 2.05563e+08 )
									ret := -0.632075
								if( Negative_Money_Flow_Sum > 2.05563e+08 )
									ret := -0.377907
							if( Positive_Money_Flow_Sum > 2.02825e+09 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 3.36669e+08 )
							if( MFI_High <= -3.17182 )
								if( Positive_Money_Flow_Sum <= 8.95598e+08 )
									ret := 0.695652
								if( Positive_Money_Flow_Sum > 8.95598e+08 )
									ret := -0.302083
							if( MFI_High > -3.17182 )
								if( Positive_Money_Flow_Sum <= 1.60893e+09 )
									ret := 0.880952 // buy
								if( Positive_Money_Flow_Sum > 1.60893e+09 )
									ret := 0.245098
				if( Positive_Money_Flow_Sum > 2.75267e+09 )
					if( Money_Flow_Ratio <= 9.25227 )
						if( Typical_Price <= 330.281 )
							if( MFI_Low <= 64.8471 )
								if( Negative_Money_Flow_Sum <= 5.99621e+08 )
									ret := -0.966667 // sell
								if( Negative_Money_Flow_Sum > 5.99621e+08 )
									ret := -0.700000 // sell
							if( MFI_Low > 64.8471 )
								if( MFI <= 87.4843 )
									ret := -0.333333
								if( MFI > 87.4843 )
									ret := -0.861111 // sell
						if( Typical_Price > 330.281 )
							ret := 0.285714
					if( Money_Flow_Ratio > 9.25227 )
						if( Positive_Money_Flow_Sum <= 3.88456e+09 )
							ret := 0.625000
						if( Positive_Money_Flow_Sum > 3.88456e+09 )
							if( Money_Flow_Ratio <= 10.4545 )
								ret := -0.600000
							if( Money_Flow_Ratio > 10.4545 )
								ret := 0.000000
			if( Negative_Money_Flow_Sum > 6.74789e+08 )
				if( Positive_Money_Flow_Sum <= 3.58719e+09 )
					if( Positive_Money_Flow_Sum <= 2.52669e+09 )
						if( MFI_Low <= 55.85 )
							if( Positive_Money_Flow_Sum <= 1.8604e+09 )
								if( Negative_Money_Flow <= 1.44536e+08 )
									ret := -0.086957
								if( Negative_Money_Flow > 1.44536e+08 )
									ret := 0.767857 // buy
							if( Positive_Money_Flow_Sum > 1.8604e+09 )
								if( MFI <= 70.7191 )
									ret := -0.457447
								if( MFI > 70.7191 )
									ret := 0.146667
						if( MFI_Low > 55.85 )
							ret := 0.800000 // buy
					if( Positive_Money_Flow_Sum > 2.52669e+09 )
						if( MFI_Low <= 62.1742 )
							if( Raw_Money_Flow <= 2.00374e+08 )
								if( Raw_Money_Flow <= 1.70253e+08 )
									ret := -0.500000
								if( Raw_Money_Flow > 1.70253e+08 )
									ret := -0.153846
							if( Raw_Money_Flow > 2.00374e+08 )
								if( MFI_Low <= 48.0864 )
									ret := 0.928571 // buy
								if( MFI_Low > 48.0864 )
									ret := 0.600000
						if( MFI_Low > 62.1742 )
							ret := -0.800000 // sell
				if( Positive_Money_Flow_Sum > 3.58719e+09 )
					if( Typical_Price <= 283.255 )
						if( Money_Flow_Ratio <= 2.37701 )
							if( MFI_Low <= 47.0925 )
								if( Money_Flow_Ratio <= 1.94907 )
									ret := -0.400000
								if( Money_Flow_Ratio > 1.94907 )
									ret := 0.500000
							if( MFI_Low > 47.0925 )
								if( Positive_Money_Flow_Sum <= 1.33069e+10 )
									ret := -0.521739
								if( Positive_Money_Flow_Sum > 1.33069e+10 )
									ret := 0.200000
						if( Money_Flow_Ratio > 2.37701 )
							if( Raw_Money_Flow <= 2.3028e+09 )
								if( Negative_Money_Flow_Sum <= 2.06293e+09 )
									ret := 0.028902
								if( Negative_Money_Flow_Sum > 2.06293e+09 )
									ret := 0.342995
							if( Raw_Money_Flow > 2.3028e+09 )
								if( Typical_Price <= 117.995 )
									ret := 0.857143 // buy
								if( Typical_Price > 117.995 )
									ret := -0.625000
					if( Typical_Price > 283.255 )
						if( Typical_Price <= 444.428 )
							if( Negative_Money_Flow_Sum <= 1.42765e+09 )
								if( Typical_Price <= 299.756 )
									ret := -0.600000
								if( Typical_Price > 299.756 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.42765e+09 )
								if( Raw_Money_Flow <= 1.65699e+09 )
									ret := 0.534682
								if( Raw_Money_Flow > 1.65699e+09 )
									ret := -0.363636
						if( Typical_Price > 444.428 )
							if( Negative_Money_Flow <= 4.1696e+08 )
								if( Positive_Money_Flow <= 2.0502e+06 )
									ret := 0.325000
								if( Positive_Money_Flow > 2.0502e+06 )
									ret := 0.875000 // buy
							if( Negative_Money_Flow > 4.1696e+08 )
								if( Money_Flow_Ratio <= 3.98736 )
									ret := 0.021277
								if( Money_Flow_Ratio > 3.98736 )
									ret := 0.261146
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_NVDA_30Min_689ddb63(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


