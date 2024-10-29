//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: SOLUSDT_30Min_2MM0_f20510d4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2MM0_f20510d4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_f20510d4(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 1.47579e+07 )
		if( Negative_Money_Flow_Sum <= 523799 )
			if( Short_MA <= 2.07567 )
				if( Short_MA <= 1.35632 )
					if( MFI_High <= -11.7016 )
						if( Short_MA <= 1.32322 )
							if( Typical_Price <= 1.27745 )
								ret := 1.000000 // buy
							if( Typical_Price > 1.27745 )
								if( Short_MA <= 1.28231 )
									ret := -0.500000
								if( Short_MA > 1.28231 )
									ret := 0.342105
						if( Short_MA > 1.32322 )
							if( Raw_Money_Flow <= 31444.4 )
								if( Negative_Money_Flow_Sum <= 254098 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow_Sum > 254098 )
									ret := -0.200000
							if( Raw_Money_Flow > 31444.4 )
								if( Money_Flow_Ratio <= 1.96457 )
									ret := 0.926829 // buy
								if( Money_Flow_Ratio > 1.96457 )
									ret := 0.500000
					if( MFI_High > -11.7016 )
						if( Short_Long_Diff <= 0.015688 )
							ret := 0.000000
						if( Short_Long_Diff > 0.015688 )
							ret := -0.800000 // sell
				if( Short_MA > 1.35632 )
					if( Short_Long_Diff <= 0.060872 )
						if( Positive_Money_Flow_Sum <= 1.02552e+06 )
							if( MFI_High <= 7.09368 )
								if( Positive_Money_Flow_Sum <= 293860 )
									ret := 0.069787
								if( Positive_Money_Flow_Sum > 293860 )
									ret := -0.120833
							if( MFI_High > 7.09368 )
								if( Positive_Money_Flow_Sum <= 466708 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 466708 )
									ret := 0.864865 // buy
						if( Positive_Money_Flow_Sum > 1.02552e+06 )
							if( Short_Long_Diff <= 0.047368 )
								if( Positive_Money_Flow_Sum <= 1.29176e+06 )
									ret := -0.822222 // sell
								if( Positive_Money_Flow_Sum > 1.29176e+06 )
									ret := -0.391304
							if( Short_Long_Diff > 0.047368 )
								if( Negative_Money_Flow_Sum <= 373368 )
									ret := -0.375000
								if( Negative_Money_Flow_Sum > 373368 )
									ret := 1.000000 // buy
					if( Short_Long_Diff > 0.060872 )
						if( Negative_Money_Flow_Sum <= 193567 )
							ret := 0.250000
						if( Negative_Money_Flow_Sum > 193567 )
							if( Negative_Money_Flow_Sum <= 409456 )
								if( MFI <= 91.8637 )
									ret := 1.000000 // buy
								if( MFI > 91.8637 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 409456 )
								ret := 0.400000
			if( Short_MA > 2.07567 )
				if( MFI_Low <= 7.8324 )
					if( MFI_Low <= -3.18388 )
						if( Long_MA <= 2.5298 )
							ret := 0.500000
						if( Long_MA > 2.5298 )
							ret := 0.000000
					if( MFI_Low > -3.18388 )
						if( Raw_Money_Flow <= 48300.3 )
							if( Short_Long_Diff <= -0.014675 )
								if( Short_Long_Diff <= -0.042676 )
									ret := -0.250000
								if( Short_Long_Diff > -0.042676 )
									ret := -0.907692 // sell
							if( Short_Long_Diff > -0.014675 )
								ret := -0.166667
						if( Raw_Money_Flow > 48300.3 )
							if( Negative_Money_Flow <= 56538.3 )
								ret := 0.166667
							if( Negative_Money_Flow > 56538.3 )
								if( MFI_Low <= 3.32763 )
									ret := -0.900000 // sell
								if( MFI_Low > 3.32763 )
									ret := -0.250000
				if( MFI_Low > 7.8324 )
					if( Negative_Money_Flow_Sum <= 450597 )
						if( Positive_Money_Flow <= 33519.3 )
							if( MA_Cross <= 0.208042 )
								if( Short_Long_Diff <= 0.097031 )
									ret := -0.001634
								if( Short_Long_Diff > 0.097031 )
									ret := -0.900000 // sell
							if( MA_Cross > 0.208042 )
								if( Long_MA <= 2.28084 )
									ret := 0.450000
								if( Long_MA > 2.28084 )
									ret := 0.937500 // buy
						if( Positive_Money_Flow > 33519.3 )
							if( Negative_Money_Flow_Sum <= 407541 )
								if( Positive_Money_Flow_Sum <= 573522 )
									ret := -0.148810
								if( Positive_Money_Flow_Sum > 573522 )
									ret := -0.491453
							if( Negative_Money_Flow_Sum > 407541 )
								if( Negative_Money_Flow_Sum <= 414907 )
									ret := 0.857143 // buy
								if( Negative_Money_Flow_Sum > 414907 )
									ret := -0.062500
					if( Negative_Money_Flow_Sum > 450597 )
						if( Positive_Money_Flow <= 429196 )
							if( Money_Flow_Ratio <= 0.484283 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.484283 )
								if( Positive_Money_Flow_Sum <= 618814 )
									ret := -0.675676
								if( Positive_Money_Flow_Sum > 618814 )
									ret := -0.310345
						if( Positive_Money_Flow > 429196 )
							if( Raw_Money_Flow <= 647404 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 647404 )
								ret := 0.500000
		if( Negative_Money_Flow_Sum > 523799 )
			if( Typical_Price <= 2.19688 )
				if( Raw_Money_Flow <= 71796.6 )
					if( Long_MA <= 1.9266 )
						if( Positive_Money_Flow_Sum <= 689976 )
							if( Raw_Money_Flow <= 44066.9 )
								if( Negative_Money_Flow_Sum <= 684885 )
									ret := 0.478571
								if( Negative_Money_Flow_Sum > 684885 )
									ret := 0.054795
							if( Raw_Money_Flow > 44066.9 )
								if( Short_Long_Diff <= -0.010139 )
									ret := -0.265487
								if( Short_Long_Diff > -0.010139 )
									ret := 0.333333
						if( Positive_Money_Flow_Sum > 689976 )
							if( MFI_High <= -24.6707 )
								if( Short_Long_Diff <= 0.017848 )
									ret := 0.839286 // buy
								if( Short_Long_Diff > 0.017848 )
									ret := 0.444444
							if( MFI_High > -24.6707 )
								if( Typical_Price <= 1.83683 )
									ret := 0.351351
								if( Typical_Price > 1.83683 )
									ret := -0.750000 // sell
					if( Long_MA > 1.9266 )
						if( Positive_Money_Flow_Sum <= 1.35624e+06 )
							if( Positive_Money_Flow_Sum <= 320105 )
								if( Negative_Money_Flow_Sum <= 765344 )
									ret := -0.425197
								if( Negative_Money_Flow_Sum > 765344 )
									ret := 0.175439
							if( Positive_Money_Flow_Sum > 320105 )
								if( MFI <= 49.1094 )
									ret := 0.125926
								if( MFI > 49.1094 )
									ret := 0.636364
						if( Positive_Money_Flow_Sum > 1.35624e+06 )
							if( Money_Flow_Ratio <= 1.37072 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 1.37072 )
								ret := -0.750000 // sell
				if( Raw_Money_Flow > 71796.6 )
					if( Short_MA <= 1.37075 )
						if( Long_MA <= 1.29547 )
							ret := 0.000000
						if( Long_MA > 1.29547 )
							if( Negative_Money_Flow_Sum <= 1.42232e+06 )
								if( Typical_Price <= 1.34443 )
									ret := -1.000000 // sell
								if( Typical_Price > 1.34443 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.42232e+06 )
								ret := -0.250000
					if( Short_MA > 1.37075 )
						if( Short_Long_Diff <= -0.009144 )
							if( Negative_Money_Flow_Sum <= 599064 )
								if( Negative_Money_Flow <= 100991 )
									ret := -0.400000
								if( Negative_Money_Flow > 100991 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 599064 )
								if( Negative_Money_Flow_Sum <= 4.15212e+06 )
									ret := 0.508117
								if( Negative_Money_Flow_Sum > 4.15212e+06 )
									ret := -0.192308
						if( Short_Long_Diff > -0.009144 )
							if( Positive_Money_Flow <= 444663 )
								if( Positive_Money_Flow <= 223839 )
									ret := 0.214751
								if( Positive_Money_Flow > 223839 )
									ret := -0.339286
							if( Positive_Money_Flow > 444663 )
								if( Short_MA <= 2.06572 )
									ret := 1.000000 // buy
								if( Short_MA > 2.06572 )
									ret := 0.500000
			if( Typical_Price > 2.19688 )
				if( Long_MA <= 146.761 )
					if( Negative_Money_Flow_Sum <= 1.99898e+08 )
						if( Short_Long_Diff <= -0.792591 )
							if( Positive_Money_Flow_Sum <= 8.35224e+07 )
								if( Long_MA <= 26.3001 )
									ret := 0.466667
								if( Long_MA > 26.3001 )
									ret := -0.026346
							if( Positive_Money_Flow_Sum > 8.35224e+07 )
								if( Positive_Money_Flow <= 2.07844e+07 )
									ret := -0.341924
								if( Positive_Money_Flow > 2.07844e+07 )
									ret := 0.204545
						if( Short_Long_Diff > -0.792591 )
							if( Long_MA <= 2.3967 )
								if( MFI <= 73.3513 )
									ret := -0.084298
								if( MFI > 73.3513 )
									ret := -0.710145 // sell
							if( Long_MA > 2.3967 )
								if( Positive_Money_Flow_Sum <= 4.42966e+08 )
									ret := 0.057891
								if( Positive_Money_Flow_Sum > 4.42966e+08 )
									ret := -0.794118 // sell
					if( Negative_Money_Flow_Sum > 1.99898e+08 )
						if( Short_Long_Diff <= 2.22762 )
							if( Negative_Money_Flow_Sum <= 2.871e+08 )
								if( Money_Flow_Ratio <= 0.918501 )
									ret := 0.331565
								if( Money_Flow_Ratio > 0.918501 )
									ret := -0.081967
							if( Negative_Money_Flow_Sum > 2.871e+08 )
								if( Positive_Money_Flow_Sum <= 1.14872e+08 )
									ret := 0.047619
								if( Positive_Money_Flow_Sum > 1.14872e+08 )
									ret := 0.600939
						if( Short_Long_Diff > 2.22762 )
							if( Short_MA <= 135.31 )
								ret := -1.000000 // sell
							if( Short_MA > 135.31 )
								if( Positive_Money_Flow <= 1.64397e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.64397e+07 )
									ret := -0.166667
				if( Long_MA > 146.761 )
					if( Money_Flow_Ratio <= 0.409588 )
						if( MFI <= 28.1352 )
							if( Positive_Money_Flow_Sum <= 1.2744e+07 )
								if( Positive_Money_Flow_Sum <= 9.60438e+06 )
									ret := -0.256410
								if( Positive_Money_Flow_Sum > 9.60438e+06 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 1.2744e+07 )
								if( Positive_Money_Flow_Sum <= 3.93954e+07 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 3.93954e+07 )
									ret := 0.055738
						if( MFI > 28.1352 )
							if( Negative_Money_Flow <= 1.33649e+07 )
								if( Short_Long_Diff <= -1.27452 )
									ret := -0.602564
								if( Short_Long_Diff > -1.27452 )
									ret := -0.263158
							if( Negative_Money_Flow > 1.33649e+07 )
								ret := 0.750000 // buy
					if( Money_Flow_Ratio > 0.409588 )
						if( Negative_Money_Flow_Sum <= 5.18658e+08 )
							if( Raw_Money_Flow <= 5.55801e+07 )
								if( Negative_Money_Flow_Sum <= 4.54251e+08 )
									ret := 0.003991
								if( Negative_Money_Flow_Sum > 4.54251e+08 )
									ret := 0.705882 // buy
							if( Raw_Money_Flow > 5.55801e+07 )
								if( Positive_Money_Flow_Sum <= 6.17155e+08 )
									ret := -0.150376
								if( Positive_Money_Flow_Sum > 6.17155e+08 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 5.18658e+08 )
							if( Positive_Money_Flow <= 1.02015e+08 )
								if( Typical_Price <= 176.324 )
									ret := -0.714286 // sell
								if( Typical_Price > 176.324 )
									ret := -0.931034 // sell
							if( Positive_Money_Flow > 1.02015e+08 )
								ret := 0.571429
	if( Negative_Money_Flow > 1.47579e+07 )
		if( Money_Flow_Ratio <= 0.844903 )
			if( Short_MA <= 146.001 )
				if( Short_Long_Diff <= -0.988571 )
					if( Negative_Money_Flow <= 4.42677e+07 )
						if( Positive_Money_Flow_Sum <= 1.61239e+08 )
							if( MFI_Low <= 6.53064 )
								if( Negative_Money_Flow_Sum <= 1.13531e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.13531e+08 )
									ret := 0.466887
							if( MFI_Low > 6.53064 )
								if( Negative_Money_Flow_Sum <= 2.05903e+08 )
									ret := 0.430622
								if( Negative_Money_Flow_Sum > 2.05903e+08 )
									ret := 0.824176 // buy
						if( Positive_Money_Flow_Sum > 1.61239e+08 )
							if( Negative_Money_Flow_Sum <= 7.24081e+08 )
								if( MFI_High <= -50.542 )
									ret := -1.000000 // sell
								if( MFI_High > -50.542 )
									ret := -0.088235
							if( Negative_Money_Flow_Sum > 7.24081e+08 )
								if( Money_Flow_Ratio <= 0.555146 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.555146 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow > 4.42677e+07 )
						if( Short_MA <= 141.135 )
							if( Negative_Money_Flow_Sum <= 1.6081e+08 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.6081e+08 )
								if( Positive_Money_Flow_Sum <= 4.7933e+08 )
									ret := 0.892157 // buy
								if( Positive_Money_Flow_Sum > 4.7933e+08 )
									ret := 0.142857
						if( Short_MA > 141.135 )
							if( Negative_Money_Flow_Sum <= 2.3634e+08 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 2.3634e+08 )
								if( Short_Long_Diff <= -4.35204 )
									ret := -0.250000
								if( Short_Long_Diff > -4.35204 )
									ret := 0.666667
				if( Short_Long_Diff > -0.988571 )
					if( Negative_Money_Flow <= 2.44854e+07 )
						if( Negative_Money_Flow <= 2.17549e+07 )
							if( Negative_Money_Flow_Sum <= 1.37575e+08 )
								if( MA_Cross <= 1.06417 )
									ret := 0.165789
								if( MA_Cross > 1.06417 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.37575e+08 )
								if( Negative_Money_Flow <= 1.67782e+07 )
									ret := 0.758621 // buy
								if( Negative_Money_Flow > 1.67782e+07 )
									ret := 0.352113
						if( Negative_Money_Flow > 2.17549e+07 )
							if( MFI_Low <= 4.61272 )
								if( Short_MA <= 139.479 )
									ret := -0.400000
								if( Short_MA > 139.479 )
									ret := 0.500000
							if( MFI_Low > 4.61272 )
								if( Long_MA <= 53.9758 )
									ret := 0.000000
								if( Long_MA > 53.9758 )
									ret := 0.821918 // buy
					if( Negative_Money_Flow > 2.44854e+07 )
						if( Positive_Money_Flow_Sum <= 9.17915e+07 )
							if( Negative_Money_Flow_Sum <= 7.32368e+07 )
								if( MFI_Low <= 13.7302 )
									ret := 0.642857
								if( MFI_Low > 13.7302 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 7.32368e+07 )
								if( Positive_Money_Flow_Sum <= 5.60844e+07 )
									ret := 0.025000
								if( Positive_Money_Flow_Sum > 5.60844e+07 )
									ret := -0.461538
						if( Positive_Money_Flow_Sum > 9.17915e+07 )
							if( Typical_Price <= 132.997 )
								if( Money_Flow_Ratio <= 0.62511 )
									ret := 0.444444
								if( Money_Flow_Ratio > 0.62511 )
									ret := -0.151515
							if( Typical_Price > 132.997 )
								if( Raw_Money_Flow <= 3.67176e+07 )
									ret := 0.600000
								if( Raw_Money_Flow > 3.67176e+07 )
									ret := 1.000000 // buy
			if( Short_MA > 146.001 )
				if( Negative_Money_Flow_Sum <= 1.25995e+08 )
					if( Negative_Money_Flow <= 2.59252e+07 )
						if( Negative_Money_Flow <= 1.48535e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 1.48535e+07 )
							if( Negative_Money_Flow <= 2.22849e+07 )
								if( Negative_Money_Flow <= 1.62447e+07 )
									ret := 0.085106
								if( Negative_Money_Flow > 1.62447e+07 )
									ret := -0.276423
							if( Negative_Money_Flow > 2.22849e+07 )
								if( Money_Flow_Ratio <= 0.437095 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.437095 )
									ret := 0.560000
					if( Negative_Money_Flow > 2.59252e+07 )
						if( MFI_Low <= 22.0717 )
							if( Negative_Money_Flow_Sum <= 1.00193e+08 )
								if( Negative_Money_Flow_Sum <= 8.76197e+07 )
									ret := -0.545455
								if( Negative_Money_Flow_Sum > 8.76197e+07 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 1.00193e+08 )
								if( Short_Long_Diff <= -1.32061 )
									ret := -0.333333
								if( Short_Long_Diff > -1.32061 )
									ret := -0.935484 // sell
						if( MFI_Low > 22.0717 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 1.25995e+08 )
					if( Short_Long_Diff <= -4.55508 )
						if( Negative_Money_Flow <= 3.06905e+07 )
							if( Long_MA <= 207.598 )
								if( Typical_Price <= 166.581 )
									ret := -0.153846
								if( Typical_Price > 166.581 )
									ret := 0.777778 // buy
							if( Long_MA > 207.598 )
								ret := -0.666667
						if( Negative_Money_Flow > 3.06905e+07 )
							if( Positive_Money_Flow_Sum <= 3.52362e+08 )
								if( Typical_Price <= 183.862 )
									ret := 0.947368 // buy
								if( Typical_Price > 183.862 )
									ret := 0.454545
							if( Positive_Money_Flow_Sum > 3.52362e+08 )
								ret := -0.333333
					if( Short_Long_Diff > -4.55508 )
						if( Positive_Money_Flow_Sum <= 4.10279e+08 )
							if( MFI <= 21.3503 )
								if( Short_Long_Diff <= -1.15913 )
									ret := -0.048780
								if( Short_Long_Diff > -1.15913 )
									ret := -0.666667
							if( MFI > 21.3503 )
								if( Negative_Money_Flow_Sum <= 5.67343e+08 )
									ret := 0.215686
								if( Negative_Money_Flow_Sum > 5.67343e+08 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 4.10279e+08 )
							if( Negative_Money_Flow_Sum <= 9.15213e+08 )
								if( Raw_Money_Flow <= 5.49395e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 5.49395e+07 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 9.15213e+08 )
								ret := 0.000000
		if( Money_Flow_Ratio > 0.844903 )
			if( Short_Long_Diff <= 2.83821 )
				if( Positive_Money_Flow_Sum <= 2.56811e+08 )
					if( MFI_Low <= 40.336 )
						if( Negative_Money_Flow_Sum <= 1.31535e+08 )
							if( Negative_Money_Flow_Sum <= 7.54796e+07 )
								if( Money_Flow_Ratio <= 1.03829 )
									ret := 0.418182
								if( Money_Flow_Ratio > 1.03829 )
									ret := -0.171717
							if( Negative_Money_Flow_Sum > 7.54796e+07 )
								if( Positive_Money_Flow_Sum <= 8.29855e+07 )
									ret := -0.697674
								if( Positive_Money_Flow_Sum > 8.29855e+07 )
									ret := -0.181818
						if( Negative_Money_Flow_Sum > 1.31535e+08 )
							if( Negative_Money_Flow_Sum <= 1.95791e+08 )
								if( Negative_Money_Flow_Sum <= 1.80005e+08 )
									ret := 0.135371
								if( Negative_Money_Flow_Sum > 1.80005e+08 )
									ret := 0.627451
							if( Negative_Money_Flow_Sum > 1.95791e+08 )
								if( Raw_Money_Flow <= 4.46859e+07 )
									ret := -0.404255
								if( Raw_Money_Flow > 4.46859e+07 )
									ret := 0.454545
					if( MFI_Low > 40.336 )
						if( MFI_High <= -8.21925 )
							if( Negative_Money_Flow_Sum <= 9.48306e+07 )
								if( Negative_Money_Flow_Sum <= 8.7638e+07 )
									ret := 0.260090
								if( Negative_Money_Flow_Sum > 8.7638e+07 )
									ret := -0.297297
							if( Negative_Money_Flow_Sum > 9.48306e+07 )
								if( MFI <= 60.885 )
									ret := -0.062500
								if( MFI > 60.885 )
									ret := 0.540146
						if( MFI_High > -8.21925 )
							if( Positive_Money_Flow_Sum <= 1.4658e+08 )
								if( MFI_High <= -1.60528 )
									ret := -0.789474 // sell
								if( MFI_High > -1.60528 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 1.4658e+08 )
								if( Positive_Money_Flow_Sum <= 2.09302e+08 )
									ret := 0.153846
								if( Positive_Money_Flow_Sum > 2.09302e+08 )
									ret := -0.305556
				if( Positive_Money_Flow_Sum > 2.56811e+08 )
					if( Positive_Money_Flow_Sum <= 2.88761e+08 )
						if( Raw_Money_Flow <= 3.37516e+07 )
							if( Negative_Money_Flow_Sum <= 9.45984e+07 )
								if( Long_MA <= 99.0655 )
									ret := -0.875000 // sell
								if( Long_MA > 99.0655 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 9.45984e+07 )
								if( Raw_Money_Flow <= 1.66284e+07 )
									ret := -0.500000
								if( Raw_Money_Flow > 1.66284e+07 )
									ret := -0.841270 // sell
						if( Raw_Money_Flow > 3.37516e+07 )
							if( MFI <= 56.7412 )
								ret := 0.857143 // buy
							if( MFI > 56.7412 )
								if( MFI <= 69.246 )
									ret := -0.714286 // sell
								if( MFI > 69.246 )
									ret := 0.500000
					if( Positive_Money_Flow_Sum > 2.88761e+08 )
						if( Negative_Money_Flow_Sum <= 2.97859e+08 )
							if( Positive_Money_Flow_Sum <= 4.52696e+08 )
								if( Short_Long_Diff <= 1.80856 )
									ret := 0.632653
								if( Short_Long_Diff > 1.80856 )
									ret := 0.055556
							if( Positive_Money_Flow_Sum > 4.52696e+08 )
								if( Negative_Money_Flow <= 6.77599e+07 )
									ret := -0.500000
								if( Negative_Money_Flow > 6.77599e+07 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.97859e+08 )
							if( Negative_Money_Flow_Sum <= 4.30744e+08 )
								if( Negative_Money_Flow <= 3.45803e+07 )
									ret := -0.864865 // sell
								if( Negative_Money_Flow > 3.45803e+07 )
									ret := -0.404762
							if( Negative_Money_Flow_Sum > 4.30744e+08 )
								if( Raw_Money_Flow <= 5.532e+07 )
									ret := -0.413793
								if( Raw_Money_Flow > 5.532e+07 )
									ret := 0.857143 // buy
			if( Short_Long_Diff > 2.83821 )
				if( Positive_Money_Flow_Sum <= 5.77908e+08 )
					if( Positive_Money_Flow_Sum <= 4.68528e+08 )
						if( Positive_Money_Flow_Sum <= 3.02098e+08 )
							if( MFI <= 80.847 )
								if( Short_MA <= 163.568 )
									ret := 0.326923
								if( Short_MA > 163.568 )
									ret := -0.045455
							if( MFI > 80.847 )
								if( MFI_Low <= 63.181 )
									ret := -0.750000 // sell
								if( MFI_Low > 63.181 )
									ret := 0.200000
						if( Positive_Money_Flow_Sum > 3.02098e+08 )
							if( Negative_Money_Flow_Sum <= 1.48788e+08 )
								if( Negative_Money_Flow_Sum <= 6.88936e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 6.88936e+07 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 1.48788e+08 )
								if( MFI_High <= -12.3107 )
									ret := 0.617647
								if( MFI_High > -12.3107 )
									ret := -0.333333
					if( Positive_Money_Flow_Sum > 4.68528e+08 )
						if( MFI_Low <= 49.7436 )
							ret := 0.200000
						if( MFI_Low > 49.7436 )
							if( Positive_Money_Flow_Sum <= 5.23018e+08 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 5.23018e+08 )
								if( Raw_Money_Flow <= 3.94802e+07 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 3.94802e+07 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 5.77908e+08 )
					if( Negative_Money_Flow_Sum <= 5.13664e+08 )
						if( Long_MA <= 176.716 )
							if( Short_Long_Diff <= 10.0482 )
								ret := 0.400000
							if( Short_Long_Diff > 10.0482 )
								ret := 1.000000 // buy
						if( Long_MA > 176.716 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 5.13664e+08 )
						if( Money_Flow_Ratio <= 1.14283 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 1.14283 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_SOLUSDT_30Min_f20510d4(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


