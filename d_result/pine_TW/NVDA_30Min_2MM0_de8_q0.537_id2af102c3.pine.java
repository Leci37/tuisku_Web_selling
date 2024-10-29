//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: NVDA_30Min_2MM0_2af102c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2MM0_2af102c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_2af102c3(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 7.91782e+08 )
		if( Short_Long_Diff <= 0.845474 )
			if( Raw_Money_Flow <= 9.52663e+07 )
				if( Short_Long_Diff <= -2.96895 )
					if( Long_MA <= 205.261 )
						if( Negative_Money_Flow_Sum <= 3.11436e+08 )
							if( MFI_High <= -30.6875 )
								if( Short_Long_Diff <= -3.0914 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > -3.0914 )
									ret := 0.375000
							if( MFI_High > -30.6875 )
								if( Positive_Money_Flow_Sum <= 1.8454e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.8454e+08 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 3.11436e+08 )
							if( Short_Long_Diff <= -3.18185 )
								if( Negative_Money_Flow_Sum <= 1.26752e+09 )
									ret := -0.710526 // sell
								if( Negative_Money_Flow_Sum > 1.26752e+09 )
									ret := -0.238889
							if( Short_Long_Diff > -3.18185 )
								if( Positive_Money_Flow <= 1.75218e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 1.75218e+07 )
									ret := 0.857143 // buy
					if( Long_MA > 205.261 )
						if( Money_Flow_Ratio <= 0.345407 )
							if( MFI_High <= -62.0185 )
								if( Short_MA <= 495.238 )
									ret := 0.297203
								if( Short_MA > 495.238 )
									ret := -0.016461
							if( MFI_High > -62.0185 )
								if( Positive_Money_Flow <= 9.51037e+06 )
									ret := 0.573123
								if( Positive_Money_Flow > 9.51037e+06 )
									ret := 0.259740
						if( Money_Flow_Ratio > 0.345407 )
							if( Short_MA <= 405.783 )
								if( Negative_Money_Flow_Sum <= 4.8324e+07 )
									ret := 0.461538
								if( Negative_Money_Flow_Sum > 4.8324e+07 )
									ret := -0.110312
							if( Short_MA > 405.783 )
								if( Negative_Money_Flow <= 3.43252e+06 )
									ret := 0.125000
								if( Negative_Money_Flow > 3.43252e+06 )
									ret := 0.409836
				if( Short_Long_Diff > -2.96895 )
					if( Negative_Money_Flow_Sum <= 6.37279e+09 )
						if( MA_Cross <= 0.124023 )
							if( Long_MA <= 150.433 )
								if( MFI <= 81.5293 )
									ret := 0.063558
								if( MFI > 81.5293 )
									ret := 0.198915
							if( Long_MA > 150.433 )
								if( Positive_Money_Flow_Sum <= 4.58347e+06 )
									ret := -0.227017
								if( Positive_Money_Flow_Sum > 4.58347e+06 )
									ret := 0.035786
						if( MA_Cross > 0.124023 )
							if( Typical_Price <= 283.142 )
								if( Positive_Money_Flow_Sum <= 9.3993e+06 )
									ret := -0.584416
								if( Positive_Money_Flow_Sum > 9.3993e+06 )
									ret := -0.109235
							if( Typical_Price > 283.142 )
								if( Negative_Money_Flow_Sum <= 8.35139e+08 )
									ret := 0.305085
								if( Negative_Money_Flow_Sum > 8.35139e+08 )
									ret := -0.121019
					if( Negative_Money_Flow_Sum > 6.37279e+09 )
						if( Raw_Money_Flow <= 4.98213e+07 )
							if( MFI <= 50.9892 )
								if( MFI_Low <= -2.22527 )
									ret := -0.050633
								if( MFI_Low > -2.22527 )
									ret := 0.289130
							if( MFI > 50.9892 )
								if( Short_MA <= 127.641 )
									ret := -0.309524
								if( Short_MA > 127.641 )
									ret := 0.160000
						if( Raw_Money_Flow > 4.98213e+07 )
							if( Positive_Money_Flow <= 5.08192e+07 )
								if( Short_Long_Diff <= 0.740546 )
									ret := 0.666667
								if( Short_Long_Diff > 0.740546 )
									ret := -0.500000
							if( Positive_Money_Flow > 5.08192e+07 )
								if( MFI_Low <= 15.267 )
									ret := -0.294118
								if( MFI_Low > 15.267 )
									ret := 0.430769
			if( Raw_Money_Flow > 9.52663e+07 )
				if( Short_Long_Diff <= -0.145126 )
					if( MFI_Low <= -1.5588 )
						if( Negative_Money_Flow_Sum <= 1.23647e+09 )
							if( Long_MA <= 628.011 )
								if( Negative_Money_Flow_Sum <= 6.45162e+08 )
									ret := 0.112628
								if( Negative_Money_Flow_Sum > 6.45162e+08 )
									ret := -0.183623
							if( Long_MA > 628.011 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.23647e+09 )
							if( Positive_Money_Flow_Sum <= 4.54779e+08 )
								if( Negative_Money_Flow_Sum <= 7.69839e+09 )
									ret := 0.217341
								if( Negative_Money_Flow_Sum > 7.69839e+09 )
									ret := -0.586207
							if( Positive_Money_Flow_Sum > 4.54779e+08 )
								if( Negative_Money_Flow_Sum <= 1.04884e+10 )
									ret := -0.063636
								if( Negative_Money_Flow_Sum > 1.04884e+10 )
									ret := 0.295652
					if( MFI_Low > -1.5588 )
						if( MFI_Low <= 24.7221 )
							if( MFI_High <= -49.0693 )
								if( Negative_Money_Flow_Sum <= 3.06998e+09 )
									ret := -0.197547
								if( Negative_Money_Flow_Sum > 3.06998e+09 )
									ret := 0.006647
							if( MFI_High > -49.0693 )
								if( Positive_Money_Flow_Sum <= 1.8056e+08 )
									ret := 0.478873
								if( Positive_Money_Flow_Sum > 1.8056e+08 )
									ret := 0.014458
						if( MFI_Low > 24.7221 )
							if( Short_Long_Diff <= -0.69009 )
								if( Positive_Money_Flow_Sum <= 3.20295e+09 )
									ret := -0.258065
								if( Positive_Money_Flow_Sum > 3.20295e+09 )
									ret := 0.011164
							if( Short_Long_Diff > -0.69009 )
								if( Positive_Money_Flow <= 1.22526e+08 )
									ret := -0.125850
								if( Positive_Money_Flow > 1.22526e+08 )
									ret := 0.047872
				if( Short_Long_Diff > -0.145126 )
					if( Positive_Money_Flow_Sum <= 5.69788e+08 )
						if( Raw_Money_Flow <= 4.86689e+08 )
							if( MFI_Low <= 78.0848 )
								if( Short_MA <= 134.047 )
									ret := 0.301047
								if( Short_MA > 134.047 )
									ret := 0.065653
							if( MFI_Low > 78.0848 )
								if( Typical_Price <= 116.879 )
									ret := 0.080000
								if( Typical_Price > 116.879 )
									ret := -0.447917
						if( Raw_Money_Flow > 4.86689e+08 )
							if( Short_MA <= 410.64 )
								if( Negative_Money_Flow_Sum <= 5.38788e+08 )
									ret := 0.759494 // buy
								if( Negative_Money_Flow_Sum > 5.38788e+08 )
									ret := 0.383648
							if( Short_MA > 410.64 )
								if( Positive_Money_Flow_Sum <= 6.8115e+07 )
									ret := -0.562500
								if( Positive_Money_Flow_Sum > 6.8115e+07 )
									ret := 0.571429
					if( Positive_Money_Flow_Sum > 5.69788e+08 )
						if( Short_MA <= 171.443 )
							if( Short_MA <= 153.155 )
								if( Short_MA <= 150.984 )
									ret := 0.062305
								if( Short_MA > 150.984 )
									ret := -0.457627
							if( Short_MA > 153.155 )
								if( Negative_Money_Flow_Sum <= 7.12796e+08 )
									ret := 0.009217
								if( Negative_Money_Flow_Sum > 7.12796e+08 )
									ret := 0.350820
						if( Short_MA > 171.443 )
							if( MA_Cross <= 251.992 )
								if( Positive_Money_Flow <= 2.18689e+09 )
									ret := -0.056279
								if( Positive_Money_Flow > 2.18689e+09 )
									ret := 0.311111
							if( MA_Cross > 251.992 )
								if( Positive_Money_Flow <= 1.74035e+09 )
									ret := 0.057851
								if( Positive_Money_Flow > 1.74035e+09 )
									ret := 0.478261
		if( Short_Long_Diff > 0.845474 )
			if( Short_MA <= 86.5946 )
				if( Negative_Money_Flow_Sum <= 3.02803e+07 )
					if( Money_Flow_Ratio <= 2798.62 )
						if( Negative_Money_Flow_Sum <= 828926 )
							if( Money_Flow_Ratio <= 1921.15 )
								ret := 0.000000
							if( Money_Flow_Ratio > 1921.15 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 828926 )
							ret := 1.000000 // buy
					if( Money_Flow_Ratio > 2798.62 )
						ret := 0.250000
				if( Negative_Money_Flow_Sum > 3.02803e+07 )
					if( Positive_Money_Flow_Sum <= 2.49205e+08 )
						if( MFI <= 64.5884 )
							ret := 1.000000 // buy
						if( MFI > 64.5884 )
							ret := 0.750000 // buy
					if( Positive_Money_Flow_Sum > 2.49205e+08 )
						if( Typical_Price <= 62.0028 )
							if( Raw_Money_Flow <= 421399 )
								ret := 0.000000
							if( Raw_Money_Flow > 421399 )
								if( Short_Long_Diff <= 1.01689 )
									ret := 0.333333
								if( Short_Long_Diff > 1.01689 )
									ret := 1.000000 // buy
						if( Typical_Price > 62.0028 )
							if( Raw_Money_Flow <= 2.89393e+07 )
								if( Positive_Money_Flow <= 127155 )
									ret := 0.000000
								if( Positive_Money_Flow > 127155 )
									ret := -0.714286 // sell
							if( Raw_Money_Flow > 2.89393e+07 )
								if( MFI_Low <= 59.5998 )
									ret := 0.800000 // buy
								if( MFI_Low > 59.5998 )
									ret := 0.062500
			if( Short_MA > 86.5946 )
				if( Positive_Money_Flow_Sum <= 1.26689e+10 )
					if( Raw_Money_Flow <= 5.97726e+07 )
						if( Positive_Money_Flow_Sum <= 1.96528e+07 )
							if( Negative_Money_Flow_Sum <= 2.98471e+08 )
								if( Raw_Money_Flow <= 3.39297e+06 )
									ret := 0.069444
								if( Raw_Money_Flow > 3.39297e+06 )
									ret := 0.418103
							if( Negative_Money_Flow_Sum > 2.98471e+08 )
								if( MFI_High <= -77.321 )
									ret := -0.032258
								if( MFI_High > -77.321 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.96528e+07 )
							if( Positive_Money_Flow_Sum <= 6.45779e+07 )
								if( Positive_Money_Flow <= 1.38339e+07 )
									ret := -0.033684
								if( Positive_Money_Flow > 1.38339e+07 )
									ret := -0.272401
							if( Positive_Money_Flow_Sum > 6.45779e+07 )
								if( MFI_Low <= 45.4859 )
									ret := 0.131656
								if( MFI_Low > 45.4859 )
									ret := 0.040513
					if( Raw_Money_Flow > 5.97726e+07 )
						if( Money_Flow_Ratio <= 46.9444 )
							if( Negative_Money_Flow_Sum <= 9.2716e+07 )
								if( Short_Long_Diff <= 1.5328 )
									ret := 0.086735
								if( Short_Long_Diff > 1.5328 )
									ret := -0.256831
							if( Negative_Money_Flow_Sum > 9.2716e+07 )
								if( Positive_Money_Flow_Sum <= 4.18743e+08 )
									ret := 0.241266
								if( Positive_Money_Flow_Sum > 4.18743e+08 )
									ret := 0.098633
						if( Money_Flow_Ratio > 46.9444 )
							if( Raw_Money_Flow <= 1.22222e+09 )
								if( Long_MA <= 219.924 )
									ret := 0.360202
								if( Long_MA > 219.924 )
									ret := 0.057732
							if( Raw_Money_Flow > 1.22222e+09 )
								if( Positive_Money_Flow_Sum <= 2.28334e+09 )
									ret := 0.968254 // buy
								if( Positive_Money_Flow_Sum > 2.28334e+09 )
									ret := 0.315385
				if( Positive_Money_Flow_Sum > 1.26689e+10 )
					if( Long_MA <= 1201.91 )
						if( Positive_Money_Flow_Sum <= 3.19195e+10 )
							if( MFI <= 97.9528 )
								if( Negative_Money_Flow_Sum <= 1.51998e+10 )
									ret := 0.194002
								if( Negative_Money_Flow_Sum > 1.51998e+10 )
									ret := 0.649351
							if( MFI > 97.9528 )
								if( Positive_Money_Flow_Sum <= 1.83045e+10 )
									ret := 0.782609 // buy
								if( Positive_Money_Flow_Sum > 1.83045e+10 )
									ret := 0.266667
						if( Positive_Money_Flow_Sum > 3.19195e+10 )
							if( Short_Long_Diff <= 13.6192 )
								if( MFI_Low <= 61.5268 )
									ret := 0.606061
								if( MFI_Low > 61.5268 )
									ret := 0.923077 // buy
							if( Short_Long_Diff > 13.6192 )
								if( MFI <= 96.5701 )
									ret := 0.100000
								if( MFI > 96.5701 )
									ret := -0.833333 // sell
					if( Long_MA > 1201.91 )
						if( Money_Flow_Ratio <= 4.22964 )
							if( Negative_Money_Flow <= 2.42021e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow > 2.42021e+07 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 4.22964 )
							ret := 0.000000
	if( Negative_Money_Flow > 7.91782e+08 )
		if( MFI <= 51.144 )
			if( Positive_Money_Flow_Sum <= 1.57288e+10 )
				if( Long_MA <= 484.69 )
					if( Negative_Money_Flow_Sum <= 8.9474e+08 )
						if( Raw_Money_Flow <= 8.43184e+08 )
							if( Negative_Money_Flow_Sum <= 8.36693e+08 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 8.36693e+08 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 8.43184e+08 )
							ret := 0.250000
					if( Negative_Money_Flow_Sum > 8.9474e+08 )
						if( MFI_High <= -79.1064 )
							if( Negative_Money_Flow_Sum <= 3.04091e+09 )
								if( Negative_Money_Flow_Sum <= 1.4278e+09 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 1.4278e+09 )
									ret := -0.578947
							if( Negative_Money_Flow_Sum > 3.04091e+09 )
								if( Raw_Money_Flow <= 2.82133e+09 )
									ret := 0.375000
								if( Raw_Money_Flow > 2.82133e+09 )
									ret := 1.000000 // buy
						if( MFI_High > -79.1064 )
							if( Negative_Money_Flow_Sum <= 1.81143e+09 )
								if( Negative_Money_Flow_Sum <= 1.66325e+09 )
									ret := -0.096654
								if( Negative_Money_Flow_Sum > 1.66325e+09 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 1.81143e+09 )
								if( Negative_Money_Flow_Sum <= 4.36718e+09 )
									ret := -0.302554
								if( Negative_Money_Flow_Sum > 4.36718e+09 )
									ret := -0.134129
				if( Long_MA > 484.69 )
					if( Short_Long_Diff <= -17.8167 )
						if( Raw_Money_Flow <= 6.79935e+09 )
							if( Positive_Money_Flow_Sum <= 8.65343e+09 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.65343e+09 )
								ret := 0.800000 // buy
						if( Raw_Money_Flow > 6.79935e+09 )
							ret := 0.250000
					if( Short_Long_Diff > -17.8167 )
						if( Positive_Money_Flow_Sum <= 1.08185e+10 )
							if( Money_Flow_Ratio <= 0.015566 )
								if( Raw_Money_Flow <= 1.71921e+09 )
									ret := -0.250000
								if( Raw_Money_Flow > 1.71921e+09 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.015566 )
								if( Short_Long_Diff <= 3.04884 )
									ret := 0.082910
								if( Short_Long_Diff > 3.04884 )
									ret := 0.469136
						if( Positive_Money_Flow_Sum > 1.08185e+10 )
							if( Short_MA <= 961.041 )
								if( Negative_Money_Flow_Sum <= 1.90369e+10 )
									ret := -0.692308
								if( Negative_Money_Flow_Sum > 1.90369e+10 )
									ret := -0.153846
							if( Short_MA > 961.041 )
								if( Short_MA <= 1138.17 )
									ret := 0.750000 // buy
								if( Short_MA > 1138.17 )
									ret := 0.250000
			if( Positive_Money_Flow_Sum > 1.57288e+10 )
				if( Negative_Money_Flow <= 2.33233e+09 )
					if( Raw_Money_Flow <= 1.65647e+09 )
						ret := -0.500000
					if( Raw_Money_Flow > 1.65647e+09 )
						if( Negative_Money_Flow_Sum <= 2.79323e+10 )
							if( Long_MA <= 863.184 )
								ret := -1.000000 // sell
							if( Long_MA > 863.184 )
								ret := -0.800000 // sell
						if( Negative_Money_Flow_Sum > 2.79323e+10 )
							if( MFI <= 37.1816 )
								ret := -1.000000 // sell
							if( MFI > 37.1816 )
								ret := -0.250000
				if( Negative_Money_Flow > 2.33233e+09 )
					if( Positive_Money_Flow_Sum <= 1.989e+10 )
						if( MFI_High <= -43.1121 )
							if( Long_MA <= 939.584 )
								ret := -0.750000 // sell
							if( Long_MA > 939.584 )
								ret := -0.250000
						if( MFI_High > -43.1121 )
							if( Positive_Money_Flow_Sum <= 1.84875e+10 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.84875e+10 )
								ret := -0.250000
					if( Positive_Money_Flow_Sum > 1.989e+10 )
						if( MFI_High <= -40.9367 )
							ret := -1.000000 // sell
						if( MFI_High > -40.9367 )
							if( MFI_High <= -31.6219 )
								if( Short_MA <= 827.764 )
									ret := 0.000000
								if( Short_MA > 827.764 )
									ret := -0.333333
							if( MFI_High > -31.6219 )
								ret := -1.000000 // sell
		if( MFI > 51.144 )
			if( Short_Long_Diff <= 1.74534 )
				if( Negative_Money_Flow_Sum <= 2.34423e+09 )
					if( Negative_Money_Flow_Sum <= 1.57583e+09 )
						if( Negative_Money_Flow_Sum <= 1.03807e+09 )
							if( Positive_Money_Flow_Sum <= 1.35177e+09 )
								ret := -0.285714
							if( Positive_Money_Flow_Sum > 1.35177e+09 )
								if( Typical_Price <= 244.726 )
									ret := 0.689655
								if( Typical_Price > 244.726 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.03807e+09 )
							if( Raw_Money_Flow <= 1.03932e+09 )
								if( MFI_Low <= 52.7228 )
									ret := -0.954545 // sell
								if( MFI_Low > 52.7228 )
									ret := -0.500000
							if( Raw_Money_Flow > 1.03932e+09 )
								if( Negative_Money_Flow_Sum <= 1.1539e+09 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.1539e+09 )
									ret := -0.448276
					if( Negative_Money_Flow_Sum > 1.57583e+09 )
						if( Long_MA <= 446.768 )
							if( Raw_Money_Flow <= 8.48005e+08 )
								ret := 0.142857
							if( Raw_Money_Flow > 8.48005e+08 )
								if( Negative_Money_Flow <= 2.00296e+09 )
									ret := 0.815385 // buy
								if( Negative_Money_Flow > 2.00296e+09 )
									ret := 0.000000
						if( Long_MA > 446.768 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 2.34423e+09 )
					if( MFI_Low <= 36.913 )
						if( Long_MA <= 393.579 )
							if( Short_Long_Diff <= 1.11799 )
								if( Negative_Money_Flow <= 9.28846e+08 )
									ret := -0.166667
								if( Negative_Money_Flow > 9.28846e+08 )
									ret := 0.577465
							if( Short_Long_Diff > 1.11799 )
								if( Long_MA <= 193.717 )
									ret := -0.692308
								if( Long_MA > 193.717 )
									ret := 0.250000
						if( Long_MA > 393.579 )
							if( Short_Long_Diff <= 1.12022 )
								if( Money_Flow_Ratio <= 1.1723 )
									ret := -0.052632
								if( Money_Flow_Ratio > 1.1723 )
									ret := -0.478261
							if( Short_Long_Diff > 1.12022 )
								if( Positive_Money_Flow_Sum <= 1.43374e+10 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.43374e+10 )
									ret := 1.000000 // buy
					if( MFI_Low > 36.913 )
						if( Positive_Money_Flow_Sum <= 1.38283e+10 )
							if( Negative_Money_Flow_Sum <= 3.19705e+09 )
								if( Typical_Price <= 305.356 )
									ret := 0.281250
								if( Typical_Price > 305.356 )
									ret := -0.454545
							if( Negative_Money_Flow_Sum > 3.19705e+09 )
								if( Negative_Money_Flow_Sum <= 3.58484e+09 )
									ret := -0.857143 // sell
								if( Negative_Money_Flow_Sum > 3.58484e+09 )
									ret := -0.335878
						if( Positive_Money_Flow_Sum > 1.38283e+10 )
							if( Positive_Money_Flow_Sum <= 1.77213e+10 )
								if( MFI <= 61.4405 )
									ret := -0.384615
								if( MFI > 61.4405 )
									ret := 0.575758
							if( Positive_Money_Flow_Sum > 1.77213e+10 )
								if( Negative_Money_Flow <= 1.30415e+09 )
									ret := -0.900000 // sell
								if( Negative_Money_Flow > 1.30415e+09 )
									ret := -0.108696
			if( Short_Long_Diff > 1.74534 )
				if( Negative_Money_Flow_Sum <= 9.44522e+09 )
					if( Raw_Money_Flow <= 2.77057e+09 )
						if( Negative_Money_Flow_Sum <= 2.79772e+09 )
							if( MFI_High <= -24.9022 )
								if( Short_Long_Diff <= 4.25754 )
									ret := 0.800000 // buy
								if( Short_Long_Diff > 4.25754 )
									ret := -1.000000 // sell
							if( MFI_High > -24.9022 )
								if( Positive_Money_Flow_Sum <= 3.93993e+09 )
									ret := 0.825000 // buy
								if( Positive_Money_Flow_Sum > 3.93993e+09 )
									ret := 0.318182
						if( Negative_Money_Flow_Sum > 2.79772e+09 )
							if( Short_Long_Diff <= 4.43897 )
								if( Negative_Money_Flow_Sum <= 3.77042e+09 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 3.77042e+09 )
									ret := 0.114286
							if( Short_Long_Diff > 4.43897 )
								if( Long_MA <= 456.906 )
									ret := 0.640000
								if( Long_MA > 456.906 )
									ret := 0.118280
					if( Raw_Money_Flow > 2.77057e+09 )
						if( MFI_Low <= 39.6998 )
							ret := 0.600000
						if( MFI_Low > 39.6998 )
							if( MFI <= 74.1828 )
								if( Negative_Money_Flow_Sum <= 5.46698e+09 )
									ret := 0.142857
								if( Negative_Money_Flow_Sum > 5.46698e+09 )
									ret := -0.571429
							if( MFI > 74.1828 )
								if( Negative_Money_Flow_Sum <= 7.33124e+09 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 7.33124e+09 )
									ret := -0.500000
				if( Negative_Money_Flow_Sum > 9.44522e+09 )
					if( Money_Flow_Ratio <= 1.21325 )
						if( Short_MA <= 505.83 )
							if( Raw_Money_Flow <= 2.4592e+09 )
								ret := -0.333333
							if( Raw_Money_Flow > 2.4592e+09 )
								ret := 1.000000 // buy
						if( Short_MA > 505.83 )
							if( Positive_Money_Flow_Sum <= 1.30621e+10 )
								ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 1.30621e+10 )
								ret := 0.000000
					if( Money_Flow_Ratio > 1.21325 )
						if( Short_Long_Diff <= 2.35538 )
							if( Positive_Money_Flow_Sum <= 2.42658e+10 )
								ret := 0.571429
							if( Positive_Money_Flow_Sum > 2.42658e+10 )
								ret := -0.333333
						if( Short_Long_Diff > 2.35538 )
							if( Negative_Money_Flow_Sum <= 1.66919e+10 )
								if( Negative_Money_Flow <= 3.64503e+09 )
									ret := 0.760870 // buy
								if( Negative_Money_Flow > 3.64503e+09 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.66919e+10 )
								if( Short_Long_Diff <= 9.67486 )
									ret := -0.125000
								if( Short_Long_Diff > 9.67486 )
									ret := 0.714286 // buy
	
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
float op_operation = decision_tree_0_NVDA_30Min_2af102c3(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


